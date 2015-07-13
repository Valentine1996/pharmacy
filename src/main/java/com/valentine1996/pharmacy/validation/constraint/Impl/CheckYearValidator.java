package com.valentine1996.pharmacy.validation.constraint.Impl;

import com.valentine1996.pharmacy.model.service.YearService;
import com.valentine1996.pharmacy.validation.constraint.CheckYear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class CheckYearValidator implements ConstraintValidator<CheckYear, Integer> {

    @Autowired
    YearService yearService;

    @Override
    public void initialize(CheckYear checkYear) {
    int x = 5;
    }

    @Override
    public boolean isValid(Integer object, ConstraintValidatorContext constraintContext) {

        if(yearService.findByName(object)== null){
            return true;

        }
        return false;
    }
}
