package com.kenzie.examples.week8.advancedshape;

public class Square extends AdvancedShape {

    int angle;

    public Square(String name, int measure1, String color) {
        super(name, measure1, color);
    }

    @Override
    int calculate_perimeter() {
        return 4* measure1;
    }
}
