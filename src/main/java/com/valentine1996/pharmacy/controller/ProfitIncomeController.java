package com.valentine1996.pharmacy.controller;

import com.valentine1996.pharmacy.model.help.SimpleProfit;
import com.valentine1996.pharmacy.model.repository.ProfitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valentyn on 7/15/15.
 */
@Controller
@RequestMapping(value = "/incexpfilter/")
public class ProfitIncomeController {
    @Autowired
    ProfitRepository profitRepository;
    
}
