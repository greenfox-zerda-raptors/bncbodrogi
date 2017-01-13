package com.greenfox.securesourcedemo.controllers;

import com.greenfox.securesourcedemo.services.MainServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    MainServices mainServices;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String mainPage(Model model, Principal principal) {
        mainServices.setLoggedInName(model, principal);
        mainServices.getUserTrips(model, principal);
        return "/index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage() {
        return "/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerNewUser(Model model,
                                  @RequestParam("username") String username,
                                  @RequestParam("password") String password,
                                  @RequestParam("verify") String verify) {
        if (verify.equals(password)) {
            mainServices.addNewUser(username, password);
            return "redirect:/login";
        } else {
            model.addAttribute("passwordmismatch", "PASSWORD MISMATCH");
            return "/register";
        }

    }
}

