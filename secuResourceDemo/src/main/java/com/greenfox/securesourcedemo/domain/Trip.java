package com.greenfox.securesourcedemo.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "trip")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String departure;
    private String destination;
    private String user;
    private long distance;

    public Trip(String user, String departure, String destination, long distance) {
        this.user = user;
        this.departure = departure;
        this.destination = destination;
        this.distance = distance;
    }

}
