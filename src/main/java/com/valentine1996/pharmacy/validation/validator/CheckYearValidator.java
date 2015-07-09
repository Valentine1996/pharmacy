package com.valentine1996.pharmacy.validation.validator;

import com.valentine1996.pharmacy.model.entity.Year;
import com.valentine1996.pharmacy.model.service.YearService;
import com.valentine1996.pharmacy.validation.constraint.CheckYear;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CheckYearValidator implements ConstraintValidator<CheckYear, Integer> {

    @Autowired
    YearService yearService;

    @Override
    public void initialize(CheckYear year) {
        
    }

    @Override
    public boolean isValid(Integer object, ConstraintValidatorContext constraintContext) {

        if(yearService.findByName(object)== null){
            return false;

        }
        return true;
    }
}
