package com.mkaz.homeworks.lesson8.iterablemenu;

import com.mkaz.homeworks.lesson2.menu.Dish;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableMenu implements Iterable<Dish> {
    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public IterableMenu(String name) {
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

    @Override
    public Iterator<Dish> iterator() {
        return new Iterator<Dish>() {
            Iterator<Dish> iterator = dishes.iterator();

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public Dish next() {
                return iterator.next();
            }
        };
    }

    public String toString() {
        return "menu{" +
                "dishes=" + dishes +
                '}';
    }
}

