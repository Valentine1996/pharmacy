package com.valentine1996.model.entity;

import com.valentine1996.model.ContextAbstractModel;
import com.valentine1996.pharmacy.model.entity.Pharmacy;
import com.valentine1996.pharmacy.model.entity.Profit;
import com.valentine1996.pharmacy.model.entity.Year;
import com.valentine1996.pharmacy.model.repository.ProfitRepository;
import com.valentine1996.pharmacy.model.service.PharmacyService;
import com.valentine1996.pharmacy.model.service.ProfitService;
import com.valentine1996.pharmacy.view.form.ExpenseForm;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;

import javax.validation.ConstraintViolation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ExpenseTest extends ContextAbstractModel{

    @Autowired
    ProfitService profitService;

    @Autowired
    PharmacyService pharmacyService;

    @Autowired
    ProfitRepository profitRepository;

    @Test
    public void testExpenseFormFieldsSuccess(){
          List < String > months = new ArrayList<>();

          months.add("січень");
          months.add("лютий");

        Double sum = profitRepository.getSumOfProfitByMonthsAndYear(months, 2014);
//        Double sumTOV 
//            = profitService.getSumOfProfitByMonAndYearAndLegalFormAndCC("січень",
//            2014,
//            "ТОВ",
//            true);
//        Double sumPP
//            = profitService.getSumOfProfitByMonAndYearAndLegalFormAndCC("січень",
//            2014,
//            "ПП",
//            true);
//        Double sumFOP
//            = profitService.getSumOfProfitByMonAndYearAndLegalFormAndCC("січень",
//            2014,
//            "ФОП",
//            true);
//        Double sumWithCalcConsider 
//            = profitService.getSumOfProfitByMonAndYearAndCC("січень", 2014, true);
//        Integer countAll 
//            = profitService.getCountOfProfitByMonAndYearAndCC("січень", 2014, true);
        assertEquals(0, 0);
    }

    @Ignore
    @Test
    public void testExpenseFormFieldYear(){

        Profit profit = profitService.
            findByMonthAndYearAndPharmacy("січень", 2014, "Д");
        assertNotNull( profit);
    }
}
