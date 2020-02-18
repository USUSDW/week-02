package com.github.ususdw.example2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var reportableList = new ArrayList<Reportable>();

        // Some broken code:
         reportableList.add(new ReportableSquare(0, 0, 10, 10));
         reportableList.add(new ReportableTriangle(20, 20, 1, 1, 1, 60, 60, 60));
         reportableList.add(new ReportableCircle(-20, -20, 5));

        // What can we do to make this work?
        for (var reportable : reportableList) {
            reportable.report();
        }
    }
}
