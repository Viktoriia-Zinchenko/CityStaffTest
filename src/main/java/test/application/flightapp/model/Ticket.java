package test.application.flightapp.model;

import lombok.Data;

@Data
public class Ticket {
    private Long ticketId;
    private Double price;
    private boolean isAvailable;

    public Ticket(Long ticketId, boolean isAvailable) {
        this.ticketId = ticketId;
        this.isAvailable = isAvailable;
    }
}
