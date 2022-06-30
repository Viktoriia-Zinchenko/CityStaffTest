package test.application.flightapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Coupon is not found")
public class CouponNotValidException extends RuntimeException {
}
