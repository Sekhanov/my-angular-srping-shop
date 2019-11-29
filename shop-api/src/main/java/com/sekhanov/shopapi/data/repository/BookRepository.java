package com.sekhanov.shopapi.data.repository;

import com.sekhanov.shopapi.data.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * BookRepository
 */
public interface BookRepository extends JpaRepository<Book, Long>{

    
}