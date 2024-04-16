package com.example.ticketBookingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ticketBookingSystem.model.Name;
import com.example.ticketBookingSystem.repository.NameRepository;

@Service
public class NameService {

    @Autowired
    private NameRepository nameRepository;

    public List<Name> getAllValues() {
        return nameRepository.findAll();
    }
}
