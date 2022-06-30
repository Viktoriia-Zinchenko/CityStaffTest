package test.application.flightapp.model;

import lombok.Data;

@Data
public class Coupon {
    private Long couponId;
    private Integer price;

    public Coupon(Long couponId) {
        this.couponId = couponId;
    }

    public Coupon(Long couponId, Integer price) {
        this.couponId = couponId;
        this.price = price;
    }
}
