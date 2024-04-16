package com.example.ticketBookingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ticketBookingSystem.model.Name;

public interface NameRepository extends JpaRepository<Name, String> {
    
}
