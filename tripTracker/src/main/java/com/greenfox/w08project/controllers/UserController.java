package com.greenfox.w08project.controllers;

import com.greenfox.w08project.domain.LoggedIn;
import com.greenfox.w08project.domain.User;
import com.greenfox.w08project.domain.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String createUser(Model model, @RequestParam String customer_name, @RequestParam String password, @RequestParam int year_of_birth, @RequestParam String gender, @RequestParam String phone_number, @RequestParam String email_address) {

        String userId = "";

        try {
            User user = new User(customer_name, password, year_of_birth, gender, phone_number, email_address);
            userDao.save(user);
            LoggedIn.setId(user.getId());
            LoggedIn.setName(customer_name);
            model.addAttribute("loggedInName", LoggedIn.getName().replaceAll(String.valueOf((char) 32), String.valueOf((char) 00)));
            model.addAttribute("loggedInId", String.valueOf(LoggedIn.getId()));
        } catch (Exception ex) {
            return "Error creating new user:" + ex.toString();
        }
        return "redirect:/listTrips";
    }
}
