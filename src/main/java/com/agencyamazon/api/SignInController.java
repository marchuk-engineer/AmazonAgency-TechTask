package com.agencyamazon.api;

import com.agencyamazon.api.dto.SignInDto;
import com.agencyamazon.service.SignInService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SignInController {

    private final SignInService signInService;

    @PostMapping("/sign-in")
    public ResponseEntity<?> signIn(@Valid @RequestBody SignInDto dto, HttpServletResponse response) {
        return signInService.login(dto, response) ? new ResponseEntity<>("Successfully authorized", HttpStatus.OK) : new ResponseEntity<>("Username and/or password might be wrong", HttpStatus.UNAUTHORIZED);
    }

}
