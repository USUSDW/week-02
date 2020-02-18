package com.github.ususdw.example2;

public class ReportableCircle extends Circle implements Reportable {

    public ReportableCircle(int x, int y, int radius) {
        super(x, y, radius);
    }

    @Override
    public void report() {
        super.reportCircle();
    }

}
