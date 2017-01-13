package com.greenfox.securesourcedemo.services;

import com.greenfox.securesourcedemo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.security.Principal;

@Service
public class MainServices {

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserRoleRepo userRoleRepo;

    @Autowired
    TripRepo tripRepo;

    public String getLoggedIn(Principal principal) {
        return principal.getName();
    }

    public void setLoggedInName(Model model, Principal principal) {
        model.addAttribute("loggedin", getLoggedIn(principal));
    }

    public void getUserTrips(Model model, Principal principal) {
        model.addAttribute("trips", tripRepo.findByUser(principal.getName()));
    }

    public void addNewUser(String username, String password) {
        userRepo.save(new User(username, password));
        userRoleRepo.save(new UserRole(username));
    }
}
