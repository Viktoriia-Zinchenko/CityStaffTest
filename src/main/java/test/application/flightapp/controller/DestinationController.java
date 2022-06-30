package test.application.flightapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.application.flightapp.service.DestinationService;

@RestController
@RequestMapping("/destinations")
public class DestinationController {
    private final DestinationService destinationService;

    public DestinationController(DestinationService destinationService) {
        this.destinationService = destinationService;
    }
@GetMapping("/check-in")
    public boolean isSuccessful(@RequestParam Long destinationId, @RequestParam Long baggageId) {
        return destinationService.isCheckInSuccessful(destinationId, baggageId);
}
}
