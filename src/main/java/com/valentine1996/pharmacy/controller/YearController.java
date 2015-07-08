/// *** *** Controller :: YearController  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 19:15:10 :: 2014-07-08
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///

package com.valentine1996.pharmacy.controller;

import com.valentine1996.pharmacy.model.entity.Year;
import com.valentine1996.pharmacy.model.service.YearService;
import com.valentine1996.pharmacy.model.service.implementation.YearServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.GET;
import java.util.List;

/**
 * Controller for year
 *
 * @version 1.0
 */
@Controller
@RequestMapping( value = "year")
public class YearController {


    @GET
    @RequestMapping(value="/list")
    public String shopListPage() {
       // ModelAndView mav = new ModelAndView("yearList");
//        List < Year > yearList= yearService.findAll();
//        mav.addObject("yearList", yearList);
        return "WEB-INF/view/yearsList.jsp";
    }
}
