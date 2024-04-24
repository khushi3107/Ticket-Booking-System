package com.example.ticketBookingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ticketBookingSystem.model.Ticket;
import com.example.ticketBookingSystem.repository.TicketRepository;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAllValues() {
        return ticketRepository.findAll();
    }

}
