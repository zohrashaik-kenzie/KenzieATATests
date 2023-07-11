package com.kenzie.examples.week9;

public  abstract class Dish3 implements DishInterface{
    @Override
    public DishClassification getDishType() {
        return DishClassification.CONTAINS_NUTS;
    }
}
