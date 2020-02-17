package com.github.ususdw.example2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var geometryCalculables = new ArrayList<GeometryCalculable>();

        // Some broken code:
         geometryCalculables.add(new GeometryCalculableSquare(0, 0, 10, 10));
         geometryCalculables.add(new GeometryCalculableTriangle(20, 20, 1, 1, 1, 60, 60, 60));
         geometryCalculables.add(new GeometryCalculableCircle(-20, -20, 5));

        // What can we do to make this work?
        for (var reportable : geometryCalculables) {
            reportable.calculateArea();
        }
    }
}
