package com.mkaz.homeworks.lesson2.rectangle;

import java.util.ArrayList;

public class Rectangles {
    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void addRectangel(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double sumOfRectanglesAreas() {
        double areas = 0;
        for (Rectangle rectangle :
                rectangles) {
            areas += rectangle.area();
        }
        return areas;
    }
}
