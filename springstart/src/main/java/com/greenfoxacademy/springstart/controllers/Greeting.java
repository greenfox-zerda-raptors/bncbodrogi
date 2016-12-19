package com.greenfoxacademy.springstart.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicLong;

@Getter
@ToString
@AllArgsConstructor
public class Greeting {

    AtomicLong id = new AtomicLong(1);
    String content;


}
