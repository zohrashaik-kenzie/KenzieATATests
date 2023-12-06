package com.kenzie.examples.week8.advancedshape;

public class Rectangle extends AdvancedShape implements ShapeInterface{

    /**
     * String name;
     *      int measure1;
     *      String color;
     */
    int measure2; //width

    public Rectangle(String name, int measure1, String color, int measure2) {
          super(name,measure1,color);
         this.measure2 = measure2;

    }


    @Override
    public int calculate_area() {
        return measure1 * measure2;
    }

    @Override
    public int calculate_perimeter() {
        return 2 * (measure1 + measure2);
    }

    public String getName() {

        return "Rectangle";
    }
}
