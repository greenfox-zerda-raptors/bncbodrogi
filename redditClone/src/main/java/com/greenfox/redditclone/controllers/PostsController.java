package com.greenfox.redditclone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private PostRepository repository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listPosts(Model model) {
        model.addAttribute("posts", repository.findAll());
        return "post/postlist";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String newPost() {
        return "post/newpost";
    }

}
