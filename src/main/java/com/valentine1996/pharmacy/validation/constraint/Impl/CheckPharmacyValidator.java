package com.valentine1996.pharmacy.validation.constraint.Impl;

import com.valentine1996.pharmacy.model.service.DistributionWayService;
import com.valentine1996.pharmacy.model.service.PharmacyService;
import com.valentine1996.pharmacy.validation.constraint.CheckDisway;
import com.valentine1996.pharmacy.validation.constraint.CheckPharmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class CheckPharmacyValidator implements ConstraintValidator<CheckPharmacy, String> {

    @Autowired
    PharmacyService pharmacyService;

    @Override
    public void initialize(CheckPharmacy checkPharmacy) {
    }

    @Override
    public boolean isValid(String object, ConstraintValidatorContext constraintContext) {

        if(pharmacyService.findByShortName(object)== null){
            return false;

        }
        return true;
    }
}
