package com.kenzie.examples.week9;

public  class Dish2 implements DishInterface{
    @Override
    public DishClassification getDishType() {
        return DishClassification.ORGANIC;
    }

    @Override
    public int setServingSize() {
        return 0;
    }
}
