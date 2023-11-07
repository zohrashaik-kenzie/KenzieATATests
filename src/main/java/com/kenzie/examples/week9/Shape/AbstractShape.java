package com.kenzie.examples.week9.Shape;

public abstract class AbstractShape {

    /**
     * this method is used to caluclate the area of a shape
     * @return int
     * takes no parameters
     */
    int side;

    public abstract int calculate_area();

    int calculate_perimeter(){
        return 10;
    }

}
