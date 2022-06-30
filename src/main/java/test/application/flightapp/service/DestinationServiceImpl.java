package test.application.flightapp.service;

import org.springframework.stereotype.Service;
import test.application.flightapp.db.Storage;
import test.application.flightapp.exception.DestinationNotFoundException;
import test.application.flightapp.model.Baggage;
import test.application.flightapp.model.Destination;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DestinationServiceImpl implements DestinationService {
    @Override
    public boolean isCheckInSuccessful(Long destinationId, Long baggageId) {
        List<Destination> destination = Storage.destinations.stream()
                .filter(d -> d.getDestinationId().equals(destinationId))
                .collect(Collectors.toList());

        Optional<List<Long>> listOfBaggageId = destination.stream()
                .map(Destination::getBaggageId)
                .filter(b -> b.contains(baggageId))
                .findFirst();
        if (destination.isEmpty() || listOfBaggageId.isEmpty()) {
            throw new DestinationNotFoundException();
        }
        return true;
    }
}
