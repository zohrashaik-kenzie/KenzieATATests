package com.kenzie.examples.week9.Shape;

public class Square extends AbstractShape implements ShapeInterface, NewInterface{

    int side;

    @Override
    public int calculate_area() {
        return side * side;
    }

    @Override
    public int calculate_perimeter() {
        return 4 * side;
    }

    @Override
    public float calculate_volume() {
        return 0;
    }

    @Override
    public float calculate_fencing_cost() {
        return 0;
    }

    @Override
    public String printShape() {
        return null;
    }
}
