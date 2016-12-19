package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong idInc = new AtomicLong(0);

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public String greeting(@RequestParam("toGreet") String name) {

        idInc.getAndIncrement();
        Greeting greeting = new Greeting(idInc, name);
        return greeting.toString();
    }


}

