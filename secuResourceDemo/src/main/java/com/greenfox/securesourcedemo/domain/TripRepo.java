package com.greenfox.securesourcedemo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TripRepo extends CrudRepository<Trip, Long> {
    List<Trip> findByUser(String user);
}
