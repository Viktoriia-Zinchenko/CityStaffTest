package test.application.flightapp.service;

import test.application.flightapp.db.Storage;

import java.util.Random;

public class CouponServiceImpl implements CouponService {
    @Override
    public Double discountPrice(Long couponId, Double price) {
        double newPrice = 0;
        if (Storage.validCoupon.contains(couponId)) {
            double[] sale = {0.1, 0.5, 0.6};
            Random random = new Random();
            int pos = random.nextInt(sale.length);
            newPrice = price * pos;
        }
        return newPrice;
    }
}
