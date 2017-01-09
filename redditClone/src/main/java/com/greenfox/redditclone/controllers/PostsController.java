package com.greenfox.redditclone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/posts")
public class PostsController extends PostServices {
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listPosts(Model model) {
        fetchAllPosts(model);
        return "post/postlist";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String newPost() {
        return "post/newpost";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@RequestParam("content") String content) {
        createNewPost(content);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/{id}/upvote", method = RequestMethod.GET)
    public String upvotePost(@PathVariable long id) {
        modifyPostScore(id, +1);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/{id}/downvote", method = RequestMethod.GET)
    public String downvotePost(@PathVariable long id) {
        modifyPostScore(id, -1);
        return "redirect:/posts";
    }


}
