package com.kenzie.examples.week29.patterns.observer;

import java.util.Observable;

public class ObservableDemo extends Observable
{
    private String weather;

    public ObservableDemo(String weather)
    {
        this.weather = weather;
    }

    public String getWeather()
    {
        return weather;
    }

    public void setWeather(String weather)
    {
        this.weather = weather;
        setChanged();
        notifyObservers();
    }


}