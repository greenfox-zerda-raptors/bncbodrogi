package com.greenfox.w08project.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/html/codes/html_form_handler.cfm")
public class NewUserController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String newUserRegistered(Model model) {
        return "/newuser/newuser";
    }
}
}
