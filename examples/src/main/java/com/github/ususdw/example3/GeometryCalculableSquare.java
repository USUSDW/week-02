package com.github.ususdw.example3;

public class GeometryCalculableSquare extends Square implements GeometryCalculable {

    public GeometryCalculableSquare(int x, int y, int width, int length) {
        super(x, y, width, length);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }
}
