package test.application.flightapp.service;

import org.springframework.stereotype.Service;
import test.application.flightapp.db.Storage;
import test.application.flightapp.exception.TicketNotFoundException;
import test.application.flightapp.model.Ticket;

import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public boolean isTicketAvailable(Long ticketId) {
        Optional<Ticket> ticket = Storage.tickets.stream()
                    .filter(t -> t.getTicketId().equals(ticketId))
                    .findFirst();
        if (ticket.isEmpty()) {
            throw new TicketNotFoundException();
        }
        return ticket.get().isAvailable();
    }
}
