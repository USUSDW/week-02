package com.github.ususdw.example0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var reportableList = new ArrayList<Object>();

         reportableList.add(new Square(0, 0, 10, 10));
         reportableList.add(new Triangle(20, 20, 1, 1, 1, 60, 60, 60));
         reportableList.add(new Circle(-20, -20, 5));

        // What can we do to make this work?
        for (var reportable : reportableList) {
//            reportable.report();
        }
    }
}
