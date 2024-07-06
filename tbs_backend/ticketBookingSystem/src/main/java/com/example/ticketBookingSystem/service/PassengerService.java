package com.example.ticketBookingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ticketBookingSystem.model.Passenger;
import com.example.ticketBookingSystem.repository.PassengerRepository;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public List<Passenger> getAllValues() {
        return passengerRepository.findAll();
    }

}
