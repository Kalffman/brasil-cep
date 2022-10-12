package com.kalffman.projects.brasilcep.domain.annotation;

import com.kalffman.projects.brasilcep.domain.validator.CepValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CepValidator.class)
@Documented
public @interface CEP {

    String message() default "CEP inválido";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
