package com.greenfox.w08project.controllers;


import com.greenfox.w08project.domain.LoggedIn;
import com.greenfox.w08project.domain.TripDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class TripController {

    @RequestMapping("")
    public String createTrip(Model model) {

        model.addAttribute("name", LoggedIn.getName());
        model.addAttribute("id", String.valueOf(LoggedIn.getId()));
        
        return "/welcome/welcome";
    }

    @Autowired
    private TripDao tripDao;
}
