/// *** *** Controller :: CoefficientController  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-12 20:22:36 :: 2014-07-12 16:45:55
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///

package com.valentine1996.pharmacy.controller;


import com.valentine1996.pharmacy.model.entity.AccountingSystem;
import com.valentine1996.pharmacy.model.entity.Profit;
import com.valentine1996.pharmacy.model.entity.Year;
import com.valentine1996.pharmacy.model.help.Coefficient;
import com.valentine1996.pharmacy.model.service.PharmacyService;
import com.valentine1996.pharmacy.model.service.ProfitService;
import com.valentine1996.pharmacy.model.service.YearService;
import com.valentine1996.pharmacy.model.service.implementation.AccountingSystemServiceImpl;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller for coefficient
 *
 * @version 1.0
 */
@Controller
@RequestMapping( value = "/coefic")
public class CoefficientController {

    @Autowired
    ProfitService profitService;

    @Autowired
    PharmacyService pharmacyService;

    @Autowired
    YearService yearService;
    @RequestMapping(value = "/option")
    public String getCoefficientFilter(ModelMap model){
        List < Year > years = yearService.findAll();

        model.addAttribute("years", years);
        return "coefficients";
    }
    @RequestMapping( value="/list" )
    public String getCoefficients( @RequestParam("month") String month,
                                   @RequestParam("year") Integer year,
                                   ModelMap model){
        //- Get all short names of pharmacies-//
        List < String > shortNames = pharmacyService.getAllShortNames();
        //- Get main values -//
        Double allProfit 
            = profitService.getSumOfProfitByMonthAndYear(month, year);

        Double allProfitWithConsider 
            = profitService.getSumOfProfitByMonAndYearAndCC( month, year, true);

        if(allProfitWithConsider == null){
            List < Year > years = yearService.findAll();
            model.addAttribute("years", years);

            return "coefficients";
        }
        Double profitTOV
            = profitService.
                getSumOfProfitByMonAndYearAndLegalFormAndCC( month, year, "ТОВ", true);

        Double profitPP
            = profitService.
            getSumOfProfitByMonAndYearAndLegalFormAndCC( month, year, "ПП", true);

        Double profitFOP
            = profitService.
            getSumOfProfitByMonAndYearAndLegalFormAndCC( month, year, "ФОП", true);

        Integer countAll 
            = profitService.getCountOfProfitByMonAndYearAndCC(month, year, true);

        Integer countFOP
            = profitService.getCountOfProfitByMonAndYearAndLegalFormAndCC( month,
                                                                           year,
                                                                           "ФОП",
                                                                           true);
        Integer countPP
            = profitService.getCountOfProfitByMonAndYearAndLegalFormAndCC( month,
                                                                           year,
                                                                           "ПП",
                                                                           true);
        Integer countTOV
            = profitService.getCountOfProfitByMonAndYearAndLegalFormAndCC( month,
                                                                           year,
                                                                           "ТОВ",
                                                                           true);
        //- Calculate coefficient -//
        List < Coefficient > coefficients = new ArrayList<>();
        for(String shortName :shortNames){
            //-Find profit-//
            Profit profit = 
                profitService.findByMonthAndYearAndPharmacy( month, year, shortName);
            //- Create coefficient -//
            Coefficient coefficient = new Coefficient();
            //-LIMITS - profit NOT FOUND-//
            if(profit == null){
                continue;
            }
            //- Add data to coefficient -//
            coefficient.setPharmacy( profit.getPharmacy());
            coefficient.setProfit(profit.getProfit());
            coefficient.setPH(profit.getPH());
            coefficient.setGI( profit.getGI());
            coefficient.setGIBonus(profit.getGIBonus());
            coefficient.setGIDeposit(profit.getGIDeposit());
            coefficient.setGIAnother1(profit.getGIAnother1());
            coefficient.setGIAnother2(profit.getGIAnother2());
            //- LIMITS-//
            if( profit.getPharmacy().getCalculationConsider() == false) {
                coefficients.add(coefficient);
                continue;
            }
            //- Checking legal form -//
            String legalForm = profit.getPharmacy().getLegalForm();
            Double prof = profit.getProfit();
            //-Add rate coefficient-//
            coefficient.setRateAll( prof / allProfitWithConsider * 100);

            if( legalForm.equals("ФОП") && profitFOP != null){
                coefficient.setRateFOP( prof / profitFOP * 100);
            }
            if( legalForm.equals("ПП") && profitPP != null ){
                coefficient.setRatePP( prof / profitPP * 100);
            }
            if( legalForm.equals("ТОВ") && profitTOV != null){
                coefficient.setRateTOV( prof / profitTOV * 100);
            }
                //-Add average coefficient-//
            coefficient.setAverageAll( 100 / countAll );
            if( legalForm.equals("ФОП") && countFOP != null){
                coefficient.setAverageFOP( 100 / countFOP);
            }
            if( legalForm.equals("ПП") && countPP != null ){
                coefficient.setAveragePP( 100 / countPP);
            }
            if( legalForm.equals("ТОВ") && countTOV != null){
                coefficient.setAverageTOV( 100 / countTOV);
            }

            coefficients.add(coefficient);
            model.addAttribute("coefficients", coefficients);
            
        }

        List < Year > years = yearService.findAll();
        model.addAttribute("years", years);
        return "coefficients";
    }
}
