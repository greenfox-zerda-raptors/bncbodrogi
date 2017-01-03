package com.greenfox.w08project.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TripDao extends CrudRepository<Trip, Long> {

    public Trip findById(Long id);

}
