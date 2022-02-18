package com.kenzie.examples.compare;

import java.util.Objects;

public class ComparableCat implements Comparable<ComparableCat> {
    String binomialName;
    int weight;
    int speed;
    double body_length;
    int life_span;

    public ComparableCat() {
    }

    public ComparableCat(String binomialName, int weight) {
        this.binomialName = binomialName;
        this.weight = weight;
    }

    public ComparableCat(String binomialName, int weight, int speed) {
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

    public double getBody_length() {
        return body_length;
    }

    public void setBody_length(double body_length) {
        this.body_length = body_length;
    }

    public int getLife_span() {
        return life_span;
    }

    public void setLife_span(int life_span) {
        this.life_span = life_span;
    }

    @Override
    public int compareTo(ComparableCat o) {
        //+ve value if base object (this) is greater than the other object
       return   this.speed - o.speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ComparableCat other = (ComparableCat) o;
        return this.weight == ((ComparableCat) o).weight;
       // return Objects.equals(weight, other.weight) ;
    }
}
