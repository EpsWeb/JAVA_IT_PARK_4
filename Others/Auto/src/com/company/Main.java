package com.company;

public class Main {

    public static void main(String[] args) {

        Auto mers = new Auto(123, 200, "red");
//        mers.setColor("red");
//        mers.setNumber(123);
//        mers.setPower(200);

        Auto bmw = new Auto(345, 250, "black");
//        bmw.setColor("black");
//        bmw.setNumber(345);
//        bmw.setPower(250);

        Auto lada = new Auto(777, 70, "baklajan");
        Auto bugatti = new Auto(147, 1001, "blue");

        Auto autos[] = {mers, bmw, lada, bugatti};

        for (int i = autos.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (autos[j].getPower() > autos[j + 1].getPower()) {
                    Auto temp = autos[j];
                    autos[j] = autos[j + 1];
                    autos[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < autos.length; i++) System.out.println(autos[i].getColor() + " " + autos[i].getNumber() + " " + autos[i].getPower());
    }
}
