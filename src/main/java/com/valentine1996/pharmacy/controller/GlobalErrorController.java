package com.valentine1996.pharmacy.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalErrorController {

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e){
        return "error";
    }
}
