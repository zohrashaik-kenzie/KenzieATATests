package com.kenzie.examples.week8;

public class Application {

    public static void main(String[] args){

        Shape shape1 = new Shape("Rectangle", 10, 12);
        Shape shape2 = new Shape("Square", 10, 10);

        int area_shape1 = shape1.calculate_area();
        int area_shape2 = shape2.calculate_area();

    }
}
