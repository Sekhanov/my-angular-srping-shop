package com.sekhanov.shopapi.controller;

import java.util.List;

import com.sekhanov.shopapi.data.model.Author;
import com.sekhanov.shopapi.data.service.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AuthorController
 */
@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.findAllAuthors();
    }
    
}