package com.github.ususdw.example3;

public class Triangle {
    public final int x;
    public final int y;
    public final int side1;
    public final int side2;
    public final int side3;
    public final int angle1;
    public final int angle2;
    public final int angle3;

    public Triangle(int x, int y, int side1, int side2, int side3, int angle1, int angle2, int angle3) {
        this.x = x;
        this.y = y;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (angle1 + angle2 + angle3 != 180) {
            throw new IllegalArgumentException("Angles do not add up to 180 degrees.");
        }
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    public void reportTriangle() {
        System.out.println("Square at (" + x + ", " + y + ") with sides of lengths " + side1 + ", " + side2 + ", "
                + side3 + " and angles " + angle1 + ", " + angle2 + ", " + angle3 + ".");
    }
}
