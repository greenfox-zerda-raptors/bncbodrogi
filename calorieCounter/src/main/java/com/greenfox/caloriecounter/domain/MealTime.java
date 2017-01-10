package com.greenfox.caloriecounter.domain;

import lombok.*;
import org.joda.time.LocalDate;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Table(name = "mealTimes")
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class MealTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mealTime_id;
    private String name;
    private LocalDate date;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Meal> meals;


}
