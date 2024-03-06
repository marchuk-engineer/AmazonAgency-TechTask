package com.agencyamazon.api;

import com.agencyamazon.api.dto.RegistrationUserDto;
import com.agencyamazon.service.SignUpService;
import exception.UserAlreadyExistAuthenticationException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class SignUpController {

    private final SignUpService signUpService;

    @PostMapping(path = "/sign-up")
    public ResponseEntity<?> signUp(HttpServletRequest request, HttpServletResponse response, @Valid @RequestBody RegistrationUserDto dto) throws UserAlreadyExistAuthenticationException {
        signUpService.addUser(dto);
        return ResponseEntity.ok().body("User has been registered");
    }

}
