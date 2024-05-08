package com.kenzie.examples.week27.immutability;

public final class Person {

    public int age;
    public String name;

    public Person(){
        age = 0;
        name = "none";
    }

    @Override
    public String toString(){
        return "I am " + name + " and I am " + Integer.toString(age) + " years old.";
    }
}
