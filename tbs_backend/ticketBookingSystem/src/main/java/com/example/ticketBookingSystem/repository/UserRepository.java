package com.example.ticketBookingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ticketBookingSystem.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
