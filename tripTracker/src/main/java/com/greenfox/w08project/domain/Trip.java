package com.greenfox.w08project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "trip")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String userId;
    private int length;
    private String departure;
    private String destination;
    private String date;

    public Trip(int length, String departure, String destination, String date) {
        this.length = length;
        this.departure = departure;
        this.destination = destination;
        this.date = date;
    }
}
