package test.application.flightapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Destination or baggage id not found")
public class DestinationNotFoundException extends RuntimeException {
}
