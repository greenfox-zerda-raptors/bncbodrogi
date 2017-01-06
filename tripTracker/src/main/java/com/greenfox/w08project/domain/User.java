package com.greenfox.w08project.domain;


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
    private String name;
    private int yearOfBirth;
    private String gender;
    private String phoneNumber;
    private String emailAddress;
    private String password;
    private String username;
    private boolean enabled;

    public User(String name, String password, int yearOfBirth, String gender, String phoneNumber, String emailAddress) {
        this.name = name;
        this.password = password;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.username = generateUserName(this.name, this.id);
        this.enabled = true;

    }

    private String generateUserName(String name, long id) {
        char[] loginNameNoSpaces = name.toCharArray();
        String loginName = "";

        for (char letter : loginNameNoSpaces) {
            if (letter != (char) 32) {
                loginName += letter;
            }
        }
        loginName += id;
        return loginName.toLowerCase();
    }
}
