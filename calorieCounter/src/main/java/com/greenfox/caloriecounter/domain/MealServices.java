package com.greenfox.caloriecounter.domain;

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

    protected void deleteMeal(Long id) {
        repo.delete(id);
    }

    protected void listMeals(Model model) {
        model.addAttribute("meals", repo.findAll());
    }

    protected void sumCalories(Model model) {
        int sumOfAllCalories = 0;
        for (Meal meal : repo.findAll()) {
            sumOfAllCalories += meal.getCalories();
        }
        model.addAttribute("sumCalories", sumOfAllCalories);
    }


}
