package com.company;

public class TVControl {
    private TV tvControled;

    public TVControl(TV tvControled) {
        this.tvControled = tvControled;
    }

    public void showMenu() {
        System.out.println("Нажмите кнопку на пульте: \n" + " 0 - Включить / Выключить \n 1 - Канал №1 \n 2 - Канал №2 \n 3 - Канал №3");
    }

    public void buttonPushed(int button) {
        switch (button) {
            case 0:
                tvControled.turnOnOrOff();
                break;
            case 1:
                tvControled.switchTo(0);
                break;
            case 2:
                tvControled.switchTo(1);
                break;
            case 3:
                tvControled.switchTo(2);
                break;
            default:
                System.out.println("Нет такой кнопки, чувачок :)");
        }
    }

}
