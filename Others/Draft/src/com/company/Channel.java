package com.company;

public class Channel {

    private String name;
    private tvShow[] tvShows;

    public Channel(tvShow[] tvShows, String name) {
        this.tvShows = tvShows;
        this.name = name;
    }

    public String getToShow() {
        for (int i = 0; i < tvShows.length; i++) {
            if (tvShows[i].isNow()) return "Канал " + name + ", Передача - " + tvShows[i].getName();
        }
        return "";
    }

}
