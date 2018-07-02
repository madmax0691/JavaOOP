package com.mkaz.homeworks.lesson4.taxi;

import java.util.ArrayList;
import java.util.List;

public class RidesHistory {

    private final List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public long getTotalPrice() {
        long price = 0L;
        for (Ride ride : rides) {
            price += ride.getPrice();
        }
        return price;
    }

    @Override
    public String toString() {
        return "RidesHistory{" +
                "rides=" + rides +
                '}';
    }
}

