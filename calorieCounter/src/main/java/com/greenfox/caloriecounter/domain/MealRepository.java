package com.greenfox.caloriecounter.domain;

import com.greenfox.caloriecounter.domain.Meal;
import org.springframework.data.repository.CrudRepository;


public interface MealRepository extends CrudRepository<Meal, Long> {

    public Meal findByName(String name);
}
