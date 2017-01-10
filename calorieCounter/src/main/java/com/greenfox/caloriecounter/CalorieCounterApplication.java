package com.greenfox.caloriecounter;

import com.greenfox.caloriecounter.domain.Meal;
import com.greenfox.caloriecounter.domain.MealRepository;
import com.greenfox.caloriecounter.domain.MealTime;
import com.greenfox.caloriecounter.domain.MealTimeRepository;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CalorieCounterApplication implements CommandLineRunner {

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private MealTimeRepository mealTimeRepository;

    public static void main(String[] args) {
        SpringApplication.run(CalorieCounterApplication.class, args);
    }

    public void run(String... strings) throws Exception {

        List<Meal> meals = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            meals.add(new Meal("Random Meal", i * 300));
        }

        MealTime mealTime = MealTime.builder()
                .name("breakfast")
                .date(new LocalDate())
                .meals(meals)
                .build();

        mealTimeRepository.save(mealTime);
    }
}
