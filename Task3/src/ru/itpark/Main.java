package ru.itpark;

import static java.lang.Math.*;

public class Main {

    public static double f(double x) {
        return sin(x);
    }

    public static double integrate(int a, double b, int n) {
        // рассчитать ширину разбиения
        double result = 0;
        double l = abs(a - b) / (double) (n);
        for (double x = a; x <= b; x = x + l) {
            result = result + f(x) * l;
        }
        return result;
    }


    public static void main(String[] args) {
        double resIntegr = integrate(0, PI, 10000);
        System.out.println(resIntegr);
    }
}
