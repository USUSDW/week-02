package com.github.ususdw.example2;

public class ReportableTriangle extends Triangle implements Reportable {

    public ReportableTriangle(int x, int y, int side1, int side2, int side3, int angle1, int angle2, int angle3) {
        super(x, y, side1, side2, side3, angle1, angle2, angle3);
    }

    @Override
    public void report() {
        super.reportTriangle();
    }

}
