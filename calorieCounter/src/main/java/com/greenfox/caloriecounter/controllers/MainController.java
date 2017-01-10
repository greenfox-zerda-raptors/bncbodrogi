package com.greenfox.caloriecounter.controllers;

import com.greenfox.caloriecounter.domain.MealServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/main")
public class MainController extends MealServices {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String mainPage(Model model) {
        listMeals(model);
        sumCalories(model);
        return "/index";
    }

    @RequestMapping(value = "/newmeal", method = RequestMethod.GET)
    public String createNewMeal() {
        return "/newmeal";
    }

    @RequestMapping(value = "/addmeal", method = RequestMethod.POST)
    public String addNewMeal(@RequestParam("mealName") String mealName, @RequestParam("calories") int calories) {
        newMeal(mealName, calories, 0);
        return "redirect:/main";
    }

    @RequestMapping(value = "/deletemeal/{id}", method = RequestMethod.GET)
    public String removeMeal(@PathVariable Long id) {
        deleteMeal(id);
        return "redirect:/main";
    }

}
