package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        final int COUNT_OF_CHANNELS = 3;

        tvShow porno = new tvShow("porn", "00:00", "06:00");
        tvShow serial = new tvShow("serial", "06:00", "12:00");
        tvShow multserial = new tvShow("multserial", "12:00", "18:00");
        tvShow news = new tvShow("news", "18:00", "24:00");

        Channel firstChannel = new Channel(1);
        tvShow Channel_1[] = new tvShow[4];
        Channel_1[0] = porno;
        Channel_1[1] = serial;
        Channel_1[2] = multserial;
        Channel_1[3] = news;



        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43

    }
}