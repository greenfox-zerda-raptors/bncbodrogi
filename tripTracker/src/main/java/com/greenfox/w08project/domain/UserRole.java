package com.greenfox.w08project.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
@Getter
@lombok.Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String role;


    public UserRole(String username) {
        this.username = username;
        this.role = "ROLE_USER";
    }
}
