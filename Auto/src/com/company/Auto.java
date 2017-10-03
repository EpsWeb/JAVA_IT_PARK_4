package com.company;

public class Auto {
    private int number;
    private int power;
    private String color;

    public Auto(int number, int power, String color) {
        setNumber(number);
        setPower(power);
        setColor(color);
    }

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    void setPower(int power) {
        this.power = power;
    }

    int getPower() {
        return power;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

}
