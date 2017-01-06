package com.greenfox.w08project.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String landingPage(Model model) {
        return "/login/login";
    }
}
