package com.kenzie.examples.week8.advancedshape;

public class AdvancedShape {
     static int number_of_shapes;
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

    int calculate_area(){
        return measure1;
    }

    int calculate_perimeter() {
        return measure1;
    }

    public static void main(String[] args){
       AdvancedShape shape = new AdvancedShape();
       shape.name = "Test";
    }
}
