package com.github.ususdw.example1;

public class Circle implements Reportable {
    public final int x;
    public final int y;
    public final int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void reportCircle() {
        System.out.println("Circle at (" + x + ", " + y + ") with radius " + radius + ".");
    }

    @Override
    public void report() {
        reportCircle();
    }
}
