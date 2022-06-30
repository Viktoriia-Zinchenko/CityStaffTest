package test.application.flightapp.db;
import test.application.flightapp.model.Baggage;
import test.application.flightapp.model.Coupon;
import test.application.flightapp.model.Destination;
import test.application.flightapp.model.Ticket;

import java.util.ArrayList;
import java.util.List;


public class Storage {
    private static final Ticket ticket1 = new Ticket(1L, true);
    private static final Ticket ticket2 = new Ticket(2L, true);
    private static final Ticket ticket3 = new Ticket(3L, true);
    private static final Ticket ticket4 = new Ticket(4L, false);
    private static final Ticket ticket5 = new Ticket(5L, false);

    public static final List<Ticket> tickets = new ArrayList<>(List.of(ticket1, ticket2, ticket3, ticket4, ticket5));

    private static final Baggage baggage1 = new Baggage(11L);
    private static final Baggage baggage2 = new Baggage(22L);
    private static final Baggage baggage3 = new Baggage(33L);
    private static final Baggage baggage4 = new Baggage(44L);
    private static final Baggage baggage5 = new Baggage(55L);

    private static final Destination destination1 = new Destination(1L, List.of(baggage1.getBaggageId(),
            baggage2.getBaggageId()));
    private static final Destination destination2 = new Destination(2L, List.of(baggage2.getBaggageId(),
            baggage3.getBaggageId()));
    private static final Destination destination3 = new Destination(3L, List.of(baggage3.getBaggageId(),
            baggage4.getBaggageId(), baggage5.getBaggageId()));

    public static final List<Destination> destinations = new ArrayList<>(List.of(destination1, destination2, destination3));

    private static final Coupon coupon1 = new Coupon(1L);
    private static final Coupon coupon2 = new Coupon(2L);
    private static final Coupon coupon3 = new Coupon(3L);
    private static final Coupon coupon4 = new Coupon(4L);
    private static final Coupon coupon5 = new Coupon(5L);

    public static final List<Coupon> validCoupon = new ArrayList<>(List.of(coupon1, coupon2, coupon3, coupon4, coupon5));

}
