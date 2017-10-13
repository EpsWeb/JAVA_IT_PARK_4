package com.company;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Triangle extends Figure {

    private int side1;
    private int side2;
    private int side3;
    private int DEFAULT_SIDE = 1;

    public Triangle(int side1, int side2, int side3) {
        if (side1 > 0) {
            this.side1 = side1;
        } else this.side1 = DEFAULT_SIDE;
        if (side2 > 0) {
            this.side2 = side2;
        } else this.side2 = DEFAULT_SIDE;
        if (side3 > 0) {
            this.side3 = side3;
        } else this.side3 = DEFAULT_SIDE;
    }

    private double p() {
        return (side1 + side2 + side3) / 2;
    }

    public double area() {
        return Math.sqrt(this.p() * (this.p() - this.side1) * (this.p() - this.side2) * (this.p() - this.side3));
    }
}
