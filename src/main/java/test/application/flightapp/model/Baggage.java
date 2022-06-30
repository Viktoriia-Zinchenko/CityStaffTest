package test.application.flightapp.model;

import lombok.Data;

@Data
public class Baggage {
    private Long baggageId;

    public Baggage(Long baggageId) {
        this.baggageId = baggageId;
    }
}
