package com.example.ticketBookingSystem.model;

public enum TicketType {

    FIRST_CLASS(501, "First Class", 1000.0),
    BUSINESS_CLASS(502, "Business Class", 750.0),
    ECONOMY_CLASS(503, "Economy Class", 500.0);

    private final long code;
    private final String ticketClass;
    private final double price;

    public long getCode() {
        return code;
    }
    public String getTicketClass() {
        return ticketClass;
    }
    public double getPrice() {
        return price;
    }
    private TicketType(long code, String ticketClass, double price) {
        this.code = code;
        this.ticketClass = ticketClass;
        this.price = price;
    }

}
