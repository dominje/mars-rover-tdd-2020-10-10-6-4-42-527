package com.afs.tdd;

public class Coordinates {

    private int xAxis;
    private int yAxis;

    public Coordinates(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public int getxAxis() {
        return xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void xAxisIncreasePosition() {
        this.xAxis += 1;
    }

    public void xAxisDecreasePosition() {
        this.xAxis -= 1;
    }


    public void yAxisIncreasePosition() {
        this.yAxis += 1;
    }

    public void yAxisDecreasePosition() {
        this.yAxis -= 1;
    }


}
