package com.kenzie.examples.week9.Shape;

public class Cube implements ShapeInterface, NewInterface{

    int measure1,measure2, measure3;

    public Cube(int measure1, int measure2, int measure3) {
        this.measure1 = measure1;
        this.measure2 = measure2;
        this.measure3 = measure3;
    }

    @Override
    public float calculate_volume() {
        return 0;
    }

    @Override
    public int calculate_area() {
        return 0;
    }

    @Override
    public int calculate_perimeter() {
        return 0;
    }
}
