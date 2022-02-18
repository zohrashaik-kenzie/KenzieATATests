package com.kenzie.examples.compare;

public class Cat{
    String binomialName;
    int weight;
    int speed;
    double body_length;
    int life_span;

    public Cat(String binomialName, int weight, int speed) {
        this.binomialName = binomialName;
        this.weight = weight;
        this.speed = speed;
    }

    public String getBinomialName() {
        return binomialName;
    }

    public void setBinomialName(String binomialName) {
        this.binomialName = binomialName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
