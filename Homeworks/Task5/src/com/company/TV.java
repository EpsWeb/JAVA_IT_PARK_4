package com.company;

public class TV {
    private String name;
    private Channel[] channels;
    private boolean isOn;
    private int intOfCurrentChannel;

    public TV(String name, Channel[] channels) {
        this.name = name;
        this.channels = channels;
        this.isOn = false;
        intOfCurrentChannel = 0;
    }

    public void turnOnOrOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Выключение..");

        } else {
            System.out.println("Включение");
            isOn = true;
            show();
        }
    }

    private void show() {
        if (isOn) System.out.println(channels[intOfCurrentChannel].getToShow());
    }

    public void switchTo(int channelSwitching) {
        if (isOn) intOfCurrentChannel = channelSwitching;
        show();
    }
}
