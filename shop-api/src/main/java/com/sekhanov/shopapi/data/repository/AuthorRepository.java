package com.sekhanov.shopapi.data.repository;

import com.sekhanov.shopapi.data.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * AuthorRepository
 */
public interface AuthorRepository extends JpaRepository<Author, Long>  {

    
}