package test.application.flightapp.model;

import lombok.Data;

@Data
public class Coupon {
    private Long couponId;

    public Coupon(Long couponId) {
        this.couponId = couponId;
    }
}
