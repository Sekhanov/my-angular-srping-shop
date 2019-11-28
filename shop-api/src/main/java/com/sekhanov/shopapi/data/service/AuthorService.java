package com.sekhanov.shopapi.data.service;

import java.util.List;

import com.sekhanov.shopapi.data.model.Author;
import com.sekhanov.shopapi.data.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AuthorService
 */
@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
    
}