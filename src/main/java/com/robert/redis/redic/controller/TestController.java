package com.robert.redis.redic.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "/{name}.txt", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String testString(@PathVariable String name) {
        return name;
    }

}
