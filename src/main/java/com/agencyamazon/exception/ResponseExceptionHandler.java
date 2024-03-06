package com.agencyamazon.exception;

import com.agencyamazon.exception.ErrorItem;
import com.agencyamazon.exception.PasswordNotMatchesException;
import com.agencyamazon.exception.UserAlreadyExistAuthenticationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {

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
