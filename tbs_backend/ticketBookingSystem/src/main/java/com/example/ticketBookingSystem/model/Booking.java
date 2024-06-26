package com.example.ticketBookingSystem.model;

import java.util.Date;
import java.util.List;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

    @Column(name = "booking_id")
    @Nonnull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    @Column(name = "booking_time")
    private Date bookingTime;

    @Column(name = "pick_up")
    @Nonnull
    private String pickUp;

    @Column(name = "destination")
    @Nonnull
    private String destination;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "booking")
    private List<Ticket> tickets;

    public Booking() {
    }

    public Booking(int bookingId, Date bookingTime, String pickUp, String destination, User user,
            List<Ticket> tickets) {
        this.bookingId = bookingId;
        this.bookingTime = bookingTime;
        this.pickUp = pickUp;
        this.destination = destination;
        this.user = user;
        this.tickets = tickets;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getPickUp() {
        return pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

}
