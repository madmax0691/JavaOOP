package com.mkaz.homeworks.lesson4.taxi;

public class FamilyTariff implements Tariff {
    @Override
    public long calculatePrice(Ride ride) {
        return 50L + 20L * ride.getDistance() / ride.getPassengers();
    }
}
