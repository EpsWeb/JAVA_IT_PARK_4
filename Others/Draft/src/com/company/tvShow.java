package com.company;

import java.time.LocalTime;

public class tvShow {

    private String name;
    private LocalTime beginTime;
    private LocalTime endTime;


    public tvShow(String name, LocalTime beginTime, LocalTime endTime) {
        this.name = name;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getName() {
        return this.name;
    }

    public boolean isNow() {
        LocalTime now = LocalTime.now();
        if (now.isAfter(beginTime) && now.isBefore(endTime)) {
            return true;
        }
        return false;
    }

//    public String getTimeOfBegin() {
//        return this.beginTime;
//    }
//
//    public String getTimeOfEnd() {
//        return this.endTime;
//    }

}