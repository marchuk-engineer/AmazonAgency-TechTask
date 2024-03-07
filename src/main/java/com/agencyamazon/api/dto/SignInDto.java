package com.agencyamazon.api.dto;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class SignInDto {
    @NonNull
    private String username;
    @NonNull
    private String password;
}
