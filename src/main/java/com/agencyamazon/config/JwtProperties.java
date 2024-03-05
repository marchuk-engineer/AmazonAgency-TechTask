package com.agencyamazon.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "jwt")
@RequiredArgsConstructor
@Getter
public class JwtProperties {

    private final String secret;

    private final Integer accessTokenExpirationSeconds;

    private final Integer refreshTokenExpirationSeconds;

}
