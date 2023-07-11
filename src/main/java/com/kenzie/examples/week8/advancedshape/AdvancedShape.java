package com.kenzie.examples.week8.advancedshape;

import static com.kenzie.examples.week8.IConstants.PI;

public class AdvancedShape {
     final static int number_of_shapes = 10;
     String name;
     int measure1;
     String color;

    public AdvancedShape() {
    }

    public AdvancedShape(String name, int measure1, String color) {
        this.name = name;
        this.measure1 = measure1;
        this.color = color;
    }

    public static void main(String[] args){
       AdvancedShape shape = new AdvancedShape();
       shape.name = "Test";
    }


    int calculate_area() {
        return Integer.parseInt(String.valueOf(PI * measure1 * measure1));
    }

    int calculate_perimeter() {
        return Integer.parseInt(String.valueOf(PI *2 * measure1));
    }


}
