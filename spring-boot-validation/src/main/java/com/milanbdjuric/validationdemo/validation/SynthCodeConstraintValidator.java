package com.milanbdjuric.validationdemo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SynthCodeConstraintValidator implements ConstraintValidator<SynthCode, String> {

    private String synthPrefix;




    @Override
    public void initialize(SynthCode theSynthCode) {

        synthPrefix = theSynthCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {


        boolean result;

        if (theCode != null) {
           result = theCode.startsWith(synthPrefix);
        }
        else {
            result = true;
        }

        return result;
    }
}
