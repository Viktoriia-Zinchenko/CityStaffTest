package test.application.flightapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.application.flightapp.service.CouponService;

@RestController
@RequestMapping("/coupons")
public class CouponController {
    private final CouponService couponService;

    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    @GetMapping("/price")
    public Double getDiscountPrice(@RequestParam Long couponId,@RequestParam Double price) {
        return couponService.discountPrice(couponId, price);
    }
}
