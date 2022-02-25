package com.kenzie.examples.containerpoly;

public class Cylinder extends Container {
    double radius;
    double height;
    /**
     * Creates a Container with the given contents.
     *
     * @param contents the contents of this container.
     */
    public Cylinder(String contents, double radius, double height) throws Exception {
        super(contents);
        this.radius = radius;
        this.height = height;
    }
    //radius,height
    //volume = pi r^2 h


    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String grouping() {
        return super.grouping() + " or in pairs";
    }
}
