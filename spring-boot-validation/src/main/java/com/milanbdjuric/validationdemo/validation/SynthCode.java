package com.milanbdjuric.validationdemo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = SynthCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SynthCode {

    public String value() default "ROLAND";

    public String message() default "must start with ROLAND";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};



}
