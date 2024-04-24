package com.example.ticketBookingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ticketBookingSystem.model.User;
import com.example.ticketBookingSystem.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllValues() {
        return userRepository.findAll();
    }
}
