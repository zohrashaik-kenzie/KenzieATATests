package com.kenzie.examples.week8;

public class Shape {

    private int width;
    private int breadth;
    private String name;

    public Shape(String name,int width, int breadth ) {
        this.width = width;
        this.breadth = breadth;
        this.name = name;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int calculate_area(){
        return width * breadth + 10;
    }

}
