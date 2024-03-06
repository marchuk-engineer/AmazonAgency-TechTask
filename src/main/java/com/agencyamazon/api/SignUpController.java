package com.agencyamazon.api;

import com.agencyamazon.api.dto.RegistrationUserDto;
import com.agencyamazon.service.SignUpService;
import exception.ErrorItem;
import exception.PasswordNotMatchesException;
import exception.UserAlreadyExistAuthenticationException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

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

    @ExceptionHandler(PasswordNotMatchesException.class)
    public ResponseEntity<?> passwordMatches(PasswordNotMatchesException exception, WebRequest webRequest) {
        ErrorItem error = new ErrorItem();
        error.setMessage(exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(UserAlreadyExistAuthenticationException.class)
    public ResponseEntity<?> usernameIsTaken(UserAlreadyExistAuthenticationException exception, WebRequest webRequest) {
        ErrorItem error = new ErrorItem();
        error.setMessage(exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }

}
