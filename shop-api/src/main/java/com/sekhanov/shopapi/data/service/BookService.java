package com.sekhanov.shopapi.data.service;

import java.util.List;

import com.sekhanov.shopapi.data.model.Book;
import com.sekhanov.shopapi.data.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BookService
 */
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}