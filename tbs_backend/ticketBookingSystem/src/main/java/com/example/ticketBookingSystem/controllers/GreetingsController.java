package com.example.ticketBookingSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.ticketBookingSystem.model.Name;
import com.example.ticketBookingSystem.model.Ticket;
import com.example.ticketBookingSystem.model.User;
import com.example.ticketBookingSystem.service.NameService;
import com.example.ticketBookingSystem.service.TicketService;
import com.example.ticketBookingSystem.service.UserService;

@RestController
public class GreetingsController {

    @Autowired
    private NameService nameService;

    @Autowired
    private UserService userService;

    @Autowired
    private TicketService ticketService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/greeting/name")
    public String greeting() {
        List<Name> getNames = nameService.getAllValues();
        String result = "";
        for (Name name : getNames) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(result);
            stringBuilder.append("Hello, ");
            stringBuilder.append(name.getFirstName());
            stringBuilder.append((name.getLastName() != null) ? (" " + name.getLastName()) : "");
            stringBuilder.append(" !");
            stringBuilder.append("<br>");
            result = stringBuilder.toString();
        }
        return result;
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return userService.getAllValues();
    }

    @GetMapping("/ticket")
    public List<Ticket> getAllTickets() {
        return ticketService.getAllValues();
    }
}
