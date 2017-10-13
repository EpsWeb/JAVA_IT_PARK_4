package com.company;

public class Sphere extends Figure{

    private int radius;
    private int DEFAULT_RADIUS = 1;

    public Sphere(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else this.radius = DEFAULT_RADIUS;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

}
