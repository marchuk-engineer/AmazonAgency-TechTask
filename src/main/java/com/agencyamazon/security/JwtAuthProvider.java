package com.agencyamazon.security;

import com.agencyamazon.config.JwtProperties;
import com.agencyamazon.entity.User;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

import static com.agencyamazon.constant.SecurityConstants.BEARER;
import static com.agencyamazon.constant.SecurityConstants.REFRESH_TOKEN;

@Component
@RequiredArgsConstructor
@Log4j2
@Getter
public class JwtAuthProvider {

    private final JwtProperties jwtProperties;

    public boolean validateAccessToken(String accessToken, User user) {
        String username = extractUsername(accessToken);
        return (username.equals(user.getUsername()) && validateToken(accessToken));
    }

    public boolean validateRefreshToken(String refreshToken, User user) {
        String username = extractUsername(refreshToken);
        return (username.equals(user.getUsername()) && validateToken(refreshToken));
    }

    public String extractUsername(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey(jwtProperties.getSecret()).build()
                    .parseClaimsJws(token)
                    .getBody();


        } catch (MalformedJwtException | ExpiredJwtException | UnsupportedJwtException | IllegalArgumentException e) {
            log.error("Error parsing JWT token: ", e.getMessage());
            return null;
        }
        return claims.getSubject();
    }

    public String generateAccessToken(String email) {
        return generateToken(email, jwtProperties.getAccessTokenExpirationSeconds());
    }

    public String generateRefreshToken(String email) {
        return generateToken(email, jwtProperties.getRefreshTokenExpirationSeconds());
    }

    private String generateToken(String username, int expMinutes) {
        Date now = new Date();
        long expirationMillis = expMinutes * 60L * 1000L;
        Date expiryDate = new Date(now.getTime() + expirationMillis);

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(key())
                .compact();
    }

    private Key key() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtProperties.getSecret()));
    }

    private boolean validateToken(String token) {
        try {
            Jwts.parser()
                    .setSigningKey(key()).build()
                    .parseClaimsJws(token);
            return true;
        } catch (MalformedJwtException e) {
            log.error("Invalid JWT token: {}", e.getMessage());
        } catch (ExpiredJwtException e) {
            log.error("JWT token is expired: {}", e.getMessage());
        } catch (UnsupportedJwtException e) {
            log.error("JWT token is unsupported: {}", e.getMessage());
        } catch (IllegalArgumentException e) {
            log.error("JWT claims string is empty: {}", e.getMessage());
        }
        return false;
    }

    public String extractAccessToken(HttpServletRequest request) {
        String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);

        if (authorizationHeader != null && authorizationHeader.startsWith(BEARER)) {
            return authorizationHeader.substring(7);
        }
        return null;
    }

    public String extractRefreshToken(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equalsIgnoreCase(REFRESH_TOKEN)) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

}
