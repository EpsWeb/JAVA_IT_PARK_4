package ru.itpark;

public class Auto {
    private int number;
    private int power;
    public String color;
    Auto audi = new Auto();

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

    int getColor() {
        return color;
    }

}
