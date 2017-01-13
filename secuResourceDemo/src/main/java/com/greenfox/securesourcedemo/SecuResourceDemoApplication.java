package com.greenfox.securesourcedemo;

import com.greenfox.securesourcedemo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecuResourceDemoApplication implements CommandLineRunner {

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserRoleRepo userRoleRepo;

    @Autowired
    TripRepo tripRepo;

    public static void main(String[] args) {
        SpringApplication.run(SecuResourceDemoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        userRepo.save(new User("bodri", "bodri"));
        userRoleRepo.save(new UserRole("bodri"));

        userRepo.save(new User("sanya", "sanya"));
        userRoleRepo.save(new UserRole("sanya"));

        tripRepo.save(new Trip("bodri", "Gyor", "Szentendre", 140));
        tripRepo.save(new Trip("bodri", "Budapest", "BalatonVilagos", 130));
        tripRepo.save(new Trip("bodri", "Pecs", "Gyongyosvisonta", 200));
        tripRepo.save(new Trip("bodri", "Also Belatelep", "Debrecen", 320));
        tripRepo.save(new Trip("sanya", "Budapest", "Szentendre", 20));
        tripRepo.save(new Trip("sanya", "Szentendre", "Budapest", 20));


    }
}
