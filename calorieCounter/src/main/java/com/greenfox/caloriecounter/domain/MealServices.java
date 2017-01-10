package com.greenfox.caloriecounter.domain;

import com.greenfox.caloriecounter.controllers.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public abstract class MealServices {

    @Autowired
    private MealRepository repo;

    protected void newMeal(String mealName, int calories) {
        repo.save(new Meal(mealName, calories));
    }

    protected void listMeals(Model model) {
        model.addAttribute("meals", repo.findAll());
    }


}
