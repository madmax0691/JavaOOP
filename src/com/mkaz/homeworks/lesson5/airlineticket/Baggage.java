package com.mkaz.homeworks.lesson5.airlineticket;

public class Baggage {
    private final long costOfOneBag;
    private final long amountOfBags;

    public Baggage(long costOfOneBag, long amountOfBags) {
        this.costOfOneBag = costOfOneBag;
        this.amountOfBags = amountOfBags;
    }

    public long getCost() {
        return costOfOneBag * amountOfBags;
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "costOfOneBag=" + costOfOneBag +
                ", amountOfBags=" + amountOfBags +
                '}';
    }
}
