package com.greenfox.caloriecounter;

import com.greenfox.caloriecounter.domain.MealRepository;
import com.greenfox.caloriecounter.domain.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalorieCounterApplication implements CommandLineRunner {

    @Autowired
    private MealRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(CalorieCounterApplication.class, args);
    }

    public void run(String... strings) throws Exception {
        for (int i = 0; i < 5; i++) {
            repo.save(new Meal("Random Meal", i * 300));
        }

    }
}
