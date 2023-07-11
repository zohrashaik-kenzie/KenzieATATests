package com.kenzie.examples.week8.advancedshape;

public class Square extends AdvancedShape implements ShapeInterface{

    int angle;

    public Square(String name, int measure1, String color) {
        super(name, measure1, color);
    }



    public int calculate_total_area() {
       Rectangle rectangle1 = new Rectangle("Rectangle",10,"red",12);

       return rectangle1.calculate_area() + measure1*measure1;
    }

    @Override
    public int calculate_area() {
        return 0;
    }

    @Override
    public int calculate_perimeter() {
        return 4*measure1;
    }
}
