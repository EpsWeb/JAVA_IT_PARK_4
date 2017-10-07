package com.company;

public class tvShow {

    private String name;
    private String timeOfBegin;
    private String timeOfEnd;


    public tvShow(String name, String timeOfBegin, String timeOfEnd) {
        this.name = name;
        this.timeOfBegin = timeOfBegin;
        this.timeOfEnd = timeOfEnd;
    }

    public String getName() {
        return this.name;
    }

    public String getTimeOfBegin() {
        return this.timeOfBegin;
    }

    public String getTimeOfEnd() {
        return this.timeOfEnd;
    }

}