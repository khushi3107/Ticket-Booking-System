package com.example.ticketBookingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ticketBookingSystem.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
