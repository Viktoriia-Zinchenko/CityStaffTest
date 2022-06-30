package test.application.flightapp.model;

import lombok.Data;

import java.util.List;

@Data
public class Destination {
    private Long destinationId;
    private List<Long> baggageId;

    public Destination(Long destinationId, List<Long> baggageId) {
        this.destinationId = destinationId;
        this.baggageId = baggageId;
    }
}
