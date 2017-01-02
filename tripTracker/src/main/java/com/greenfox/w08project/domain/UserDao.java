package com.greenfox.w08project.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

    public User findById(Long id);

}
