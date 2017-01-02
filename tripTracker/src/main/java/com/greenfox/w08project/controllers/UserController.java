package com.greenfox.w08project.controllers;

import com.greenfox.w08project.domain.User;
import com.greenfox.w08project.domain.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/html/codes/html_form_handler.cfm")
public class UserController {

    @RequestMapping("")
    public String create(Model model, @RequestParam String customer_name, @RequestParam String password, @RequestParam int year_of_birth, @RequestParam String gender, @RequestParam String phone_number, @RequestParam String email_address) {

        String userId = "";

        try {
            User user = new User(customer_name, password, year_of_birth, gender, phone_number, email_address);
            userDao.save(user);
            model.addAttribute("name", customer_name);
            model.addAttribute("id", String.valueOf(user.getId()));
        } catch (Exception ex) {
            return "Error creating new user:" + ex.toString();
        }
        return "/welcome/welcome";
    }

    @Autowired
    private UserDao userDao;
}
