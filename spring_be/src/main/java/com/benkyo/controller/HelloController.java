package com.benkyo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {
	
	@RequestMapping("/")
    public String home() {
        return "Hello World";
    }

}
