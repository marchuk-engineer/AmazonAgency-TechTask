package com.agencyamazon.annotation;

import com.agencyamazon.api.dto.RegistrationUserDto;
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
        RegistrationUserDto userDto = (RegistrationUserDto) obj;
        if (userDto.getPassword().equals(userDto.getConfirmPassword())) {
            return true;
        }
        throw new PasswordNotMatchesException(defaultValidationMessage);
    }

}

