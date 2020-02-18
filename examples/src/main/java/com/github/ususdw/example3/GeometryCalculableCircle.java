package com.github.ususdw.example3;

public class GeometryCalculableCircle extends Circle implements GeometryCalculable {

    public GeometryCalculableCircle(int x, int y, int radius) {
        super(x, y, radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
