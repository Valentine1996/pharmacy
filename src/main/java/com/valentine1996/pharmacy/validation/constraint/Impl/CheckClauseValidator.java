package com.valentine1996.pharmacy.validation.constraint.Impl;

import com.valentine1996.pharmacy.model.service.DistributionWayService;
import com.valentine1996.pharmacy.model.service.IncomeExpenseClauseService;
import com.valentine1996.pharmacy.validation.constraint.CheckClause;
import com.valentine1996.pharmacy.validation.constraint.CheckDisway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class CheckClauseValidator implements ConstraintValidator<CheckClause, String> {

    @Autowired
    IncomeExpenseClauseService clauseService;

    @Override
    public void initialize(CheckClause checkClause) {
    }

    @Override
    public boolean isValid(String object, ConstraintValidatorContext constraintContext) {

        if(clauseService.findByName(object)== null){
            return false;
        }
        return true;
    }
}
