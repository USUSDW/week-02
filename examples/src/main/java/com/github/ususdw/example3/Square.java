package com.github.ususdw.example3;

public class Square {
    public final int x;
    public final int y;
    public final int width;
    public final int length;

    public Square(int x, int y, int width, int length) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
    }

    public void reportSquare() {
        System.out.println("Square at (" + x + ", " + y + ") with width of " + width + " and length " + length + ".");
    }
}
