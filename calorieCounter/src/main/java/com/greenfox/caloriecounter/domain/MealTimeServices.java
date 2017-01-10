package com.greenfox.caloriecounter.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MealTimeServices {

    @Autowired
    private MealTimeRepository repo;
}

