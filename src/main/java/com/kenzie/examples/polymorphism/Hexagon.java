package com.kenzie.examples.polymorphism;

public class Hexagon implements ShapeInterface {
    @Override
    public void draw() {

    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "I am a hexagon";
    }
}

