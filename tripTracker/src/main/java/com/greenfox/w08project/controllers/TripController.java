package com.greenfox.w08project.controllers;


import com.greenfox.w08project.domain.Trip;
import com.greenfox.w08project.domain.TripDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/listTrips")
public class TripController {

    @Autowired
    private TripDao tripDao;

    @RequestMapping("")
    public String createTrip(Model model) {


        Trip trip = new Trip(180, "Budapest", "Gyor", "2016/02/02");

        model.addAttribute("tripFrom", trip.getDeparture());
        model.addAttribute("tripTo", trip.getDestination());
        model.addAttribute("tripDate", trip.getDate());
        model.addAttribute("tripLength", trip.getLength());

        return "/listTrips/listTrips";
    }
}
