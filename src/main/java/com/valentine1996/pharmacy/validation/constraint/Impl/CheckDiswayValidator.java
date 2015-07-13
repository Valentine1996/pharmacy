package com.valentine1996.pharmacy.validation.constraint.Impl;

import com.valentine1996.pharmacy.model.service.DistributionWayService;
import com.valentine1996.pharmacy.validation.constraint.CheckDisway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class CheckDiswayValidator implements ConstraintValidator<CheckDisway, String> {

    @Autowired
    DistributionWayService distributionWayService;

    @Override
    public void initialize(CheckDisway checkDisway) {
    }

    @Override
    public boolean isValid(String object, ConstraintValidatorContext constraintContext) {

        if(distributionWayService.findByName(object)== null){
            return false;

        }
        return true;
    }
}
