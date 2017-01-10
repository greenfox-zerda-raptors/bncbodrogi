package com.greenfox.caloriecounter.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping(value = "/main")
public class MainController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String mainPage() {
        return "/index";
    }

    @RequestMapping(value = "/newmeal", method = RequestMethod.GET)
    public String addNewMeal() {
        return "/newmeal";
    }
}
