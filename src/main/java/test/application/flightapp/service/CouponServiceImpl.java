package test.application.flightapp.service;

import org.springframework.stereotype.Service;
import test.application.flightapp.db.Storage;
import test.application.flightapp.exception.CouponNotValidException;
import test.application.flightapp.model.Coupon;

import java.util.Optional;
import java.util.Random;

@Service
public class CouponServiceImpl implements CouponService {
    @Override
    public Double discountPrice(Long couponId, Double price) {
        Optional<Coupon> coupon = Storage.validCoupon.stream()
                .filter(c -> c.getCouponId().equals(couponId))
                .findFirst();
        if (coupon.isPresent()) {
            double[] sale = {0.1, 0.5, 0.6};
            Random random = new Random();
            int pos = random.nextInt(sale.length);
            return price - (price * sale[pos]);
        }
        throw new CouponNotValidException();
    }
}
