package com.valentine1996.model.entity;

import com.valentine1996.model.ContextAbstractModel;
import com.valentine1996.pharmacy.model.entity.Year;
import com.valentine1996.pharmacy.view.form.ExpenseForm;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;

import javax.validation.ConstraintViolation;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ExpenseTest extends ContextAbstractModel{


    @BeforeClass
    public static void setUp() {
        
    }
    @Ignore
    @Test
    public void testExpenseFormFieldsSuccess(){
//        Set <ConstraintViolation <ExpenseForm> > constraintViolationSet;
//        LocalValidatorFactoryBean factory=new LocalValidatorFactoryBean();
//        Validator validator = factory.getValidator();
        ExpenseForm expenseFormSuccess = new ExpenseForm(
            2013,
            "Д+ФОП",
            "%Ввсі",
            "січень",
            "sdsfhsdkjf",
            true,
            2010.0
        );

        BindingResult errors = new BeanPropertyBindingResult(expenseFormSuccess, "expenseForm");
        Year year = new Year();

        validator.validate(expenseFormSuccess);

        assertEquals(0, errors.getErrorCount());
    }
    @Ignore
    @Test
    public void testExpenseFormFieldYear(){
        Set <ConstraintViolation < ExpenseForm > > constraintViolationSet;
    }
}
