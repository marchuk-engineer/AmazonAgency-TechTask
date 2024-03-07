package com.agencyamazon.service.impl;

import com.agencyamazon.api.dto.SignInDto;
import com.agencyamazon.config.JwtProperties;
import com.agencyamazon.constant.SecurityConstants;
import com.agencyamazon.entity.User;
import com.agencyamazon.security.JwtAuthProvider;
import com.agencyamazon.service.SignInService;
import com.agencyamazon.util.CookieUtils;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import static com.agencyamazon.constant.SecurityConstants.REFRESH_TOKEN;
import static com.agencyamazon.constant.SecurityConstants.USER_ID;

@Service
@RequiredArgsConstructor
public class SignInServiceImpl implements SignInService {

    private final AuthenticationManager authenticationManager;

    private final JwtAuthProvider jwtAuthProvider;

    private final JwtProperties jwtProperties;

    @Override
    public boolean login(SignInDto dto, HttpServletResponse response) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword());
        Authentication authentication;
        try {
            authentication = authenticationManager.authenticate(authenticationToken);
        } catch (Exception e) {
            return false;
        }

        if (authentication.isAuthenticated()) {
            User userCredentials = (User) authentication.getPrincipal();

            String refreshToken = jwtAuthProvider.generateRefreshToken(dto.getUsername());
            String accessToken = jwtAuthProvider.generateAccessToken(dto.getUsername());

            CookieUtils.addCookie(response, REFRESH_TOKEN, refreshToken, jwtProperties.getRefreshTokenExpirationSeconds(), true, true);
            CookieUtils.addCookie(response, USER_ID, userCredentials.getId().toString(), jwtProperties.getRefreshTokenExpirationSeconds(), false, true);
            response.setHeader(HttpHeaders.AUTHORIZATION, SecurityConstants.BEARER + accessToken);

            SecurityContext context = SecurityContextHolder.createEmptyContext();
            context.setAuthentication(authenticationToken);
            SecurityContextHolder.setContext(context);
            return true;
        }
        return false;
    }

}
