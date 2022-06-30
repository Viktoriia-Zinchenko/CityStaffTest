package test.application.flightapp.service;

public interface TicketService {
    boolean isTicketAvailable(Long ticketId) throws RuntimeException;
}
