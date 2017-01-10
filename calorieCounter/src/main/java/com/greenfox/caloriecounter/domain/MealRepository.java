package com.greenfox.caloriecounter.domain;

import org.springframework.data.repository.CrudRepository;


public interface MealRepository extends CrudRepository<Meal, Long> {

    public Meal findByName(String name);
}
