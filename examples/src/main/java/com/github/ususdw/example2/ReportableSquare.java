package com.github.ususdw.example2;

public class ReportableSquare extends Square implements Reportable {

    public ReportableSquare(int x, int y, int width, int length) {
        super(x, y, width, length);
    }

    @Override
    public void report() {
        super.reportSquare();
    }

}
