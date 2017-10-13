package com.company;

public class Main {

    public static void main(String[] args) {

        Figure figures[] = new Figure[5];
        figures[0] = new Square(4);
        figures[1] = new Rectangle(6, 5);
        figures[2] = new Sphere(11);
        figures[3] = new Triangle(3,4,5);
        figures[4] = new Parallelogram(6,7,30);

        for (Figure f: figures) {
            System.out.println(f.area());
        }
    }
}
