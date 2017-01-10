package com.greenfox.caloriecounter.controllers;

import com.greenfox.caloriecounter.domain.Meal;
import org.springframework.data.repository.CrudRepository;


public interface MealRepository extends CrudRepository<Meal, Long> {
}
