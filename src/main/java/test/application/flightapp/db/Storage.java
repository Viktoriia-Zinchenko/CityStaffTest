package test.application.flightapp.db;
import test.application.flightapp.model.Baggage;
import test.application.flightapp.model.Coupon;
import test.application.flightapp.model.Destination;
import test.application.flightapp.model.Ticket;

import java.util.ArrayList;
import java.util.List;


public class Storage {
    private static Ticket ticket1 = new Ticket(1l, true);
    private static Ticket ticket2 = new Ticket(2l, true);
    private static Ticket ticket3 = new Ticket(3l, true);
    private static Ticket ticket4 = new Ticket(4l, false);
    private static Ticket ticket5 = new Ticket(5l, false);

    public static final List<Ticket> tickets = new ArrayList<>(List.of(ticket1, ticket2, ticket3, ticket4, ticket5));

    private static Baggage baggage1 = new Baggage(11l);
    private static Baggage baggage2 = new Baggage(22l);
    private static Baggage baggage3 = new Baggage(33l);
    private static Baggage baggage4 = new Baggage(44l);
    private static Baggage baggage5 = new Baggage(55l);

    private static Destination destination1 = new Destination(1l, List.of(baggage1.getBaggageId(),
            baggage2.getBaggageId()));
    private static Destination destination2 = new Destination(2l, List.of(baggage2.getBaggageId(),
            baggage3.getBaggageId()));
    private static Destination destination3 = new Destination(3l, List.of(baggage3.getBaggageId(),
            baggage4.getBaggageId(), baggage5.getBaggageId()));

    public static final List<Destination> destinations = new ArrayList<>(List.of(destination1, destination2, destination3));

    private static Coupon coupon1 = new Coupon(1l);
    private static Coupon coupon2 = new Coupon(2l);
    private static Coupon coupon3 = new Coupon(3l);
    private static Coupon coupon4 = new Coupon(4l);
    private static Coupon coupon5 = new Coupon(5l);

    public static final List<Coupon> validCoupon = new ArrayList<>(List.of(coupon1, coupon2, coupon3, coupon4, coupon5));

}
