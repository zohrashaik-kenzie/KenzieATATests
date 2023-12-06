package com.kenzie.examples.week9;

public class Dish1 implements DishInterface {

    @Override
    public DishClassification getDishType() {
        return DishClassification.VEGETARIAN;

    }

    @Override
    public int setServingSize() {
        return 2;
    }
}
