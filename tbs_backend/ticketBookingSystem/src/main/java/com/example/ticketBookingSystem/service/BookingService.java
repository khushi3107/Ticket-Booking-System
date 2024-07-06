package com.example.ticketBookingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ticketBookingSystem.model.Booking;
import com.example.ticketBookingSystem.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getAllValues() {
        return bookingRepository.findAll();
    }

}
