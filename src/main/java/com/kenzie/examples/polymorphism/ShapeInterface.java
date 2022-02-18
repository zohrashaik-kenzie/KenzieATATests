package com.kenzie.examples.polymorphism;

public interface ShapeInterface {

    void draw();
    double perimeter();
    default void move(){
        System.out.println("I am moving");
    }

    default void  moveUp() {
        System.out.println("I am moving up");
    }

    default void  moveDown() {
        System.out.println("I am moving down");
    }

    public static String returnShape() {
        return "This is the shape Interface";
    }
}
