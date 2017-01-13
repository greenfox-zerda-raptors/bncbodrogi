package com.greenfox.securesourcedemo.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@lombok.Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private boolean enabled;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.enabled = true;
    }

}
