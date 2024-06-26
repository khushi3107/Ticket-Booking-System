package com.example.ticketBookingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ticketBookingSystem.model.Name;

@Repository
public interface NameRepository extends JpaRepository<Name, String> {

}
