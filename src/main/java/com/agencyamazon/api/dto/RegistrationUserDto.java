package com.agencyamazon.api.dto;

import com.agencyamazon.annotation.PasswordMatches;
import lombok.*;

@Data
@AllArgsConstructor
@Builder
@PasswordMatches
@NoArgsConstructor
public class RegistrationUserDto {
    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private String repeatedPassword;
}
