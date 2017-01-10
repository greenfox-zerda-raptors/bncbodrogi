package com.greenfox.caloriecounter.domain;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Table(name = "meals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int calories;

    @ManyToOne
    @JoinColumn(name = "meal_time_id")
    private MealTime mealTime;

    public Meal(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }
}
