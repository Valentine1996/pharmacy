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


import com.valentine1996.pharmacy.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller for Authentication and Authorization
 *
 * @version 1.0
 */
@Controller
public class SecurityController {
    @Autowired
    BCryptPasswordEncoder encoder;

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
    @RequestMapping("signin")
    public String getRegistrationForm(){
        return "registration";
    }

    @RequestMapping("addUser")
    public String addUser(@ModelAttribute User user, ModelMap model){

        user.setFirstName(user.getFirstName().trim());
        user.setLastName(user.getLastName().trim());
        user.setEmail(user.getEmail().trim());
        user.setEnabled(true);
            //-Crypt a password-//
        user.setPassword(encoder.encode(user.getPassword()));
        return "";
    }

}
