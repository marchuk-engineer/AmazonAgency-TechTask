package com.agencyamazon.security;

import com.agencyamazon.config.JwtProperties;
import com.agencyamazon.constant.SecurityConstants;
import com.agencyamazon.entity.User;
import com.agencyamazon.util.CookieUtils;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

import static com.agencyamazon.constant.SecurityConstants.BEARER;
import static com.agencyamazon.constant.SecurityConstants.USER_ID;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtAuthProvider jwtProvider;

    private final JwtProperties jwtProperties;

    private final UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        String accessToken = jwtProvider.extractAccessToken(request);
        String refreshToken = jwtProvider.extractAccessToken(request);

        if (accessToken == null && refreshToken == null) {
            chain.doFilter(request, response);
            return;
        }

        String email = jwtProvider.extractUsername(refreshToken);
        if (email == null) {
            handleAuthenticationFailure(response);
            return;
        }
        UserDetails user = userDetailsService.loadUserByUsername(email);

        if (accessToken != null && jwtProvider.validateAccessToken(accessToken, (User) user)) {
            String newAccessToken = jwtProvider.generateAccessToken(email);

            saveAuthenticationDataToResponse(response, newAccessToken, refreshToken, (User) user);
            setSecurityContext(user);
        } else if (refreshToken != null && jwtProvider.validateRefreshToken(refreshToken, (User) user)) {
            String newAccessToken = jwtProvider.generateAccessToken(email);
            String newRefreshToken = jwtProvider.generateRefreshToken(email);

            saveAuthenticationDataToResponse(response, newAccessToken, newRefreshToken, (User) user);
            setSecurityContext(user);
        } else {
            handleAuthenticationFailure(response);
            return;
        }

        chain.doFilter(request, response);
    }

    private void saveAuthenticationDataToResponse(HttpServletResponse response, String accessToken, String refreshToken, User user) {
        CookieUtils.addCookie(response, SecurityConstants.REFRESH_TOKEN, refreshToken, jwtProperties.getRefreshTokenExpirationSeconds(), true, true);
        CookieUtils.addCookie(response, USER_ID, user.getId().toString(), jwtProperties.getRefreshTokenExpirationSeconds(), false, true);
        response.setHeader(HttpHeaders.AUTHORIZATION, BEARER + accessToken);
    }

    private void setSecurityContext(UserDetails userDetails) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, userDetails.getPassword(), userDetails.getAuthorities());
        SecurityContext context = SecurityContextHolder.createEmptyContext();
        context.setAuthentication(authenticationToken);
        SecurityContextHolder.setContext(context);
    }

    private void handleAuthenticationFailure(HttpServletResponse response) throws IOException {
        SecurityContextHolder.clearContext();
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid or expired tokens");
    }

}
