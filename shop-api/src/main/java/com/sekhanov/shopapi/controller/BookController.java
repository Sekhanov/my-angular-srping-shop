package com.sekhanov.shopapi.controller;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sekhanov.shopapi.data.model.Book;
import com.sekhanov.shopapi.data.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookController
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();        
    }
}