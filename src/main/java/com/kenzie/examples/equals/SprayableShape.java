package com.kenzie.examples.equals;

import java.util.Objects;

enum Spray {
    BLUE_GLOSS,
    RED_MATTE
}

public class SprayableShape {
    public Spray getSpray() {
        return spray;
    }

    public void setSpray(Spray spray) {
        this.spray = spray;
    }

    private Spray spray;

    public SprayableShape(Spray spray) {
        this.spray = spray;
    }

    // The base `SprayableShape` has a surface area of 0
    public double getSprayableArea() {
        return 0;
    }


    @Override
    public boolean equals(Object o) {
        // An object can't be equal to null.
         if (o == null){
             return false;
         }
        // If two objects have the same reference, they should be equal.
        if (this == o){
            return true;
        }

        // If the objects are of different types, they shouldn't be equal.
        if (this.getClass() != o.getClass()){
            return false;
        }


        SprayableShape that = (SprayableShape)o;
      // Finally, implement the checks for equality between attributes that make the two objects equal.
        return (this.getSpray() == that.getSpray());

    }

    @Override
    public int hashCode() {
        // Use the same properties that make the objects equal to compute a hashCode.
        return Objects.hash(spray);
    }


}
