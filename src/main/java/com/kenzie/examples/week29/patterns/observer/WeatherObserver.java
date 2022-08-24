package com.kenzie.examples.week29.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class WeatherObserver implements Observer
{

    private ObservableDemo weatherUpdate ;

    @Override
    public void update(Observable observable, Object arg)
    {
        weatherUpdate = (ObservableDemo) observable;
        System.out.println("Weather Report Live:  "+weatherUpdate.getWeather());
    }

    public static void main(String[] args)
    {
        ObservableDemo observable = new ObservableDemo(null);
        WeatherObserver observer = new WeatherObserver();
        observable.addObserver(observer);
        observable.setWeather("72 Degrees Clear and Pleasant");
        observable.setWeather("Oops we were wrong, its raining now!");
    }
}

