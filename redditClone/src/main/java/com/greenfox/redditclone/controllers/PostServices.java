package com.greenfox.redditclone.controllers;

import com.greenfox.redditclone.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
abstract class PostServices {

    @Autowired
    private PostRepository repository;

    void fetchAllPosts(Model model) {
        model.addAttribute("posts", repository.findAll());
    }

    void createNewPost(String content) {
        repository.save(new Post(content));
    }

    void modifyPostScore(long id, int scoreDifference) {
        Post post = repository.findOne(id);
        post.setScore(post.getScore() + scoreDifference);
        repository.save(post);
    }


}
