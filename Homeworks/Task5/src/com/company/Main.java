package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int COUNT_OF_CHANNELS = 3;
        Channel[] channels = new Channel[COUNT_OF_CHANNELS];
        tvShow[] first = new tvShow[3];
        channels[0] = new Channel(first, "Первый");
        first[0] = new tvShow("Новости", LocalTime.parse("00:00"), LocalTime.parse("14:00"));
        first[1] = new tvShow("Вести", LocalTime.parse("14:00"), LocalTime.parse("19:00"));
        first[2] = new tvShow("Церемония открытия пивларька", LocalTime.parse("19:00"), LocalTime.parse("23:59"));

        tvShow[] second = new tvShow[4];
        channels[1] = new Channel(second, "ТНТ");
        second[0] = new tvShow("Мультики", LocalTime.parse("00:00"), LocalTime.parse("10:00"));
        second[1] = new tvShow("Дом-2", LocalTime.parse("10:00"), LocalTime.parse("17:00"));
        second[2] = new tvShow("Боевики", LocalTime.parse("17:00"), LocalTime.parse("21:00"));
        second[3] = new tvShow("Ночной Дом-2", LocalTime.parse("21:00"), LocalTime.parse("23:59"));

        tvShow[] third = new tvShow[3];
        channels[2] = new Channel(third, "Россия-24");
        third[0] = new tvShow("Запад сгнил", LocalTime.parse("00:00"), LocalTime.parse("10:00"));
        third[1] = new tvShow("Америка вот-вот развалится", LocalTime.parse("10:00"), LocalTime.parse("17:00"));
        third[2] = new tvShow("Россия всех нагнула", LocalTime.parse("17:00"), LocalTime.parse("23:59"));

        // Создаём телек
        TV plasma = new TV("LG", channels);
        TVControl pult = new TVControl(plasma);
        pult.showMenu();

        // Действия пользователя
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Нажите на кнопку пульта");
            pult.buttonPushed(scanner.nextInt());
        }
    }
}