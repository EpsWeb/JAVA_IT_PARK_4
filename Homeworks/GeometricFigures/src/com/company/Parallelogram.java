package com.company;

public class Parallelogram extends Figure {

    private int side1;
    private int side2;
    private int trigon;
    private int DEFAULT_SIDE = 1, DEFAULT_TRIGON = 1;

    public Parallelogram(int side1, int side2, int trigon) {
        if (side1 > 0) {
            this.side1 = side1;
        } else this.side1 = DEFAULT_SIDE;
        if (side2 > 0) {
            this.side2 = side2;
        } else this.side2 = DEFAULT_SIDE;
        if (trigon > 0) {
            this.trigon = trigon;
        } else this.trigon = DEFAULT_TRIGON;
    }

    private double trigonInPI() {
        return trigon * Math.PI / 180;
    }

    public double area() {
        return this.side1 * this.side2 * Math.sin( this.trigonInPI() );
    }

}
