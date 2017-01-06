package com.greenfox.w08project.controllers;

import com.greenfox.w08project.domain.User;
import com.greenfox.w08project.domain.UserDao;
import com.greenfox.w08project.domain.UserRole;
import com.greenfox.w08project.domain.UserRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/register")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserRoleDao userRoleDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String registerForm(Model model) {

        return "/register/register";
    }

    @RequestMapping(value = "/newuser", method = RequestMethod.GET)
    public ModelAndView createUser(@RequestParam String customer_name, @RequestParam String password, @RequestParam int year_of_birth, @RequestParam String gender, @RequestParam String phone_number, @RequestParam String email_address) {

        User user = new User(customer_name, password, year_of_birth, gender, phone_number, email_address);
        userDao.save(user);
        userRoleDao.save(new UserRole(user.getUsername()));
        return new ModelAndView("redirect:/login");
    }
}
