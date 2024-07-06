package com.example.ticketBookingSystem.repository;

import org.springframework.stereotype.Repository;

import com.example.ticketBookingSystem.model.Booking;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
