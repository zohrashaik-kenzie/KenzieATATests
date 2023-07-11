package com.kenzie.examples.week8.advancedshape;

public class Triangle extends AdvancedShape{

    int measure2;
    int measure3;
    int height;
    
    public Triangle(String name, int measure1, String color, int measure2, int measure3, Tanzu tanzu) {
        super(name, measure1, color);
        this.measure2 = measure2;
        this.measure3 = measure3;
    }

    public Triangle(String name, int measure1, String color, int measure2, int measure3, int height) {
        super(name, measure1, color);
        this.measure2 = measure2;
        this.measure3 = measure3;
        this.height = height;
    }

    public int getMeasure2() {
        return measure2;
    }

    @Override
    int calculate_area() {
        return super.calculate_area() * height / 2;
    }


}
