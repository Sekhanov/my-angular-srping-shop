package com.sekhanov.shopapi.data.repository;

import com.sekhanov.shopapi.data.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserPepositrory
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);
}