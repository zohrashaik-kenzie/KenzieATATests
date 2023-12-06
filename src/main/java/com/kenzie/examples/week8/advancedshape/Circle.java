package com.kenzie.examples.week8.advancedshape;

import static com.kenzie.examples.week8.IConstants.PI;

public class Circle extends AdvancedShape{


    public Circle(String name, int measure1, String color) {
        super(name, measure1, color);
    }

    @Override
    int calculate_area() {
        return Integer.parseInt(String.valueOf(PI * measure1 * measure1));
    }

    @Override
    int calculate_perimeter() {
        return Integer.parseInt(String.valueOf(PI *2 * measure1));
    }
}
