package com.github.ususdw.example3;

public class GeometryCalculableTriangle extends Triangle implements GeometryCalculable {

    public GeometryCalculableTriangle(int x, int y, int side1, int side2, int side3, int angle1, int angle2, int angle3) {
        super(x, y, side1, side2, side3, angle1, angle2, angle3);
    }

    @Override
    public double calculateArea() {
        var perimeter = calculatePerimeter();
        return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
