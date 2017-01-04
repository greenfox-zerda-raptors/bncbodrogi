package com.greenfox.redditclone.controllers;

import com.greenfox.redditclone.domain.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by User on 2017.01.04..
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
