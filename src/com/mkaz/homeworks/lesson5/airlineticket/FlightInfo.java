package com.mkaz.homeworks.lesson5.airlineticket;

import java.time.LocalDateTime;

public class FlightInfo {
    private final long flightNumber;
    private final String placeOfDispatch;
    private final String placeOfDestination;
    private final LocalDateTime dispatchTime;
    private final long placeNumber;
    private final long price;

    public FlightInfo(long flightNumber, String placeOfDispatch, String placeOfDestination,
                      LocalDateTime dispatchTime, long placeNumber, long price) {
        this.flightNumber = flightNumber;
        this.placeOfDispatch = placeOfDispatch;
        this.placeOfDestination = placeOfDestination;
        this.dispatchTime = dispatchTime;
        this.placeNumber = placeNumber;
        this.price = price;
    }

    public long getCost() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "flightNumber=" + flightNumber +
                ", placeOfDispatch='" + placeOfDispatch + '\'' +
                ", placeOfDestination='" + placeOfDestination + '\'' +
                ", dispatchTime=" + dispatchTime +
                ", placeNumber=" + placeNumber +
                ", price=" + price +
                '}';
    }
}
