/// *** *** Controller :: SecurityController  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-08-17 16:05:36 :: 2014-08- 16:45:55
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
 * Controller for Authentication and Authorization
 *
 * @version 1.0
 */
@Controller
public class SecurityController {
    @RequestMapping("login")
    public String getLoginForm(
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout, ModelMap model) {
        if (error != null) {
            model.addAttribute("error", "Invalid username or password!");
        }

        if (logout != null) {
            model.addAttribute("msg", "You've been logged out successfully.");
        }
        return "login";
    }
}
