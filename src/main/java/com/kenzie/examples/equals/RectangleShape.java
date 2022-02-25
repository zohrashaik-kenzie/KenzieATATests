package com.kenzie.examples.equals;

import java.util.Objects;

public class RectangleShape extends SprayableShape {
    private double length;
    private double width;

    public RectangleShape(Spray spray, double length, double width) {
        super(spray);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getSprayableArea() {
        return length * width;
    }

    @Override
    public boolean equals(Object o) {
       if (o == null){
           return false;
       }

       if (this == o){
           return true;
       }

       if(this.getClass() != o.getClass()){
           return false;
       }

       RectangleShape that = (RectangleShape)o;

       return (this.getSpray() == that.getSpray()
               && this.getSprayableArea() == that.getSprayableArea());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}