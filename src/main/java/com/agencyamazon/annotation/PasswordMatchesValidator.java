package com.agencyamazon.annotation;

import exception.PasswordNotMatchesException;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    private String defaultValidationMessage;

    @Override
    public void initialize(PasswordMatches passwordMatches) {
        defaultValidationMessage = passwordMatches.message();
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        ConfirmPasswordUtil userDto = (ConfirmPasswordUtil) obj;
        if (userDto.getPassword().equals(userDto.getRepeatedPassword())) {
            return true;
        }
        throw new PasswordNotMatchesException(defaultValidationMessage);
    }

    interface ConfirmPasswordUtil {
        String getPassword();

        String getRepeatedPassword();
    }
}

