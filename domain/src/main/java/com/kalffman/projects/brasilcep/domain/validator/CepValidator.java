package com.kalffman.projects.brasilcep.domain.validator;

import com.kalffman.projects.brasilcep.domain.annotation.CEP;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class CepValidator implements ConstraintValidator<CEP, String> {

    private static final Pattern CEP_PATTERN = Pattern.compile("^([0-9]{8})$");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return CEP_PATTERN.matcher(value).matches();
    }
}
