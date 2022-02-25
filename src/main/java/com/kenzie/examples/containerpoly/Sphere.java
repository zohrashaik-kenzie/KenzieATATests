package com.kenzie.examples.containerpoly;

public class Sphere extends Container{

    double radius;
    /**
     * Creates a Container with the given contents.
     *
     * @param contents the contents of this container.
     */
    public Sphere(String contents, double radius) {
        super(contents);
        this.radius = radius;
    }
    //radius
    //volume = 4/3 Pi r ^ 3


    @Override
    public double volume() {
        return  4.0/3.0 * Math.PI * Math.pow(radius,3);
    }
}
