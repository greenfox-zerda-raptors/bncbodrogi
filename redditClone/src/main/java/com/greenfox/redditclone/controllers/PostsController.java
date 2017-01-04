package com.greenfox.redditclone.controllers;

import com.greenfox.redditclone.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView create(@RequestParam("content") String content) {
        repository.save(new Post(content));
        return new ModelAndView("redirect:/posts");
    }

    @RequestMapping(value = "/{id}/upvote", method = RequestMethod.GET)
    public ModelAndView upvotePost(@PathVariable long id, Model model) {
        Post post = repository.findOne(id);
        post.setScore(post.getScore() + 1);
        repository.save(post);
        return new ModelAndView("redirect:/posts");
    }

    @RequestMapping(value = "/{id}/downvote", method = RequestMethod.GET)
    public ModelAndView downvotePost(@PathVariable long id, Model model) {
        Post post = repository.findOne(id);
        post.setScore(post.getScore() - 1);
        repository.save(post);
        return new ModelAndView("redirect:/posts");
    }


}
