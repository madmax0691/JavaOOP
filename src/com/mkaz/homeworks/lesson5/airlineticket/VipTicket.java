package com.mkaz.homeworks.lesson5.airlineticket;

public class VipTicket extends Ticket {
    private final Baggage baggage;
    private final Meal meal;

    public VipTicket(long number, PassengerInfo passengerInfo, FlightInfo flightInfo, Baggage baggage, Meal meal) {
        super(number, passengerInfo, flightInfo);
        this.baggage = baggage;
        this.meal = meal;
    }

    public long getCost() {
        return baggage.getCost() + meal.getCost() + super.getCost();
    }

    @Override
    public String toString() {
        return "VipTicket{" +
                "baggage=" + baggage +
                ", meal=" + meal +
                "} " + super.toString();
    }
}
