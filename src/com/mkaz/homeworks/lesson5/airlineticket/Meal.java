package com.mkaz.homeworks.lesson5.airlineticket;

public class Meal {
    private final String foodType;
    private final boolean hasDrink;
    private final long price;

    public Meal(String foodType, boolean hasDrink, long price) {
        this.foodType = foodType;
        this.hasDrink = hasDrink;
        this.price = price;
    }

    public long getCost() {
        if (hasDrink) {
            return price * 2;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "foodType='" + foodType + '\'' +
                ", hasDrink=" + hasDrink +
                ", price=" + price +
                '}';
    }
}
