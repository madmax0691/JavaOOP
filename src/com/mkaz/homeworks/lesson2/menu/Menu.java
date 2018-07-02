package com.mkaz.homeworks.lesson2.menu;

import java.util.ArrayList;

public class Menu {
    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public Dish getCheapestDish() {
        int chiapestDishIndex = 0;
        int index = 0;
        for (Dish dish :
                dishes) {
            if (dish.getPrice() < dishes.get(chiapestDishIndex).getPrice()) {
                chiapestDishIndex = index;
            }
            index++;
        }
        return dishes.get(chiapestDishIndex);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "menu{" +
                "dishes=" + dishes +
                '}';
    }
}

