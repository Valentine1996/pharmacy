package com.valentine1996.model.entity;

import com.valentine1996.model.ContextAbstractModel;
import com.valentine1996.pharmacy.model.entity.Expense;
import com.valentine1996.pharmacy.model.entity.Year;
import com.valentine1996.pharmacy.view.form.ExpenseForm;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ExpenseTest extends ContextAbstractModel{

    @Test
    public void testExpenseFormFieldsSuccess(){
        Set <ConstraintViolation <ExpenseForm> > constraintViolationSet;

        ExpenseForm expenseFormSuccess = new ExpenseForm(
            2013,
            "Д+ФОП",
            "%Ввсі",
            "січень",
            "sdsfhsdkjf",
            true,
            2010.0
        );

        Year year = new Year();
        constraintViolationSet = validator.validate(expenseFormSuccess);

        assertEquals( 0, constraintViolationSet.size() );
    }
    @Ignore
    @Test
    public void testExpenseFormFieldYear(){
        Set <ConstraintViolation < ExpenseForm > > constraintViolationSet;
    }
}
