package com.kenzie.examples.week9.Shape;

public class Rectangle extends AbstractShape {
    int measure1;
    int measure2;
    @Override
    public int calculate_area() {
        return measure1 * measure2;
    }

    public Rectangle() {
    }

    public Rectangle(int measure1) {
        this.measure1 = measure1;
    }

    public Rectangle(int measure1, int measure2) {
        this.measure1 = measure1;
        this.measure2 = measure2;
    }
}
