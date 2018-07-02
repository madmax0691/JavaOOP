package com.mkaz.homeworks.lesson2.line;

public class Line {
    private final Point startPoint;
    private final Point endPoint;
    private final String name;

    public Line(double xForStarPoint, double yForStarPoint, double xForEndPoint, double yForEndPoint, String name) {
        startPoint = new Point(xForStarPoint, yForStarPoint);
        endPoint = new Point(xForEndPoint, yForEndPoint);
        this.name = name;
    }

    //Эта формула длины отрезка предоставляет возможность рассчитывать расстояние между двумя
    // произвольными точками плоскости, при условии, что известны координаты этих точек
    public double lenghtOfLine() {
        return Math.sqrt((Math.pow((endPoint.getX() - startPoint.getX()), 2) +
                Math.pow((endPoint.getY() - startPoint.getY()), 2)));
    }

    public String getName() {
        return name;
    }
}
