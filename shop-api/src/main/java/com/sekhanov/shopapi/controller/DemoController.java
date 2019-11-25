package com.sekhanov.shopapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * DemoController
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    
    @Getter
    @Setter
    @AllArgsConstructor
    private static class Person {
        private String name;
        private int age;
    }

    @GetMapping
    public Person getPerson() {
        return new Person("Ivan", 22);
    }
}