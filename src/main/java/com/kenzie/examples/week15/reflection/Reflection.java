package com.kenzie.examples.week15.reflection;

import java.util.List;

public class Reflection {
    private String name;
    private int number;
    private List<String> list;
    private long pay;

    public Reflection(String name, int number, List<String> list) {
        this.name = name;
        this.number = number;
        this.list = list;
    }

    public Reflection() {
        this.name = "Default";
    }

    public Reflection(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public boolean isGreaterThan10(){
        if (number > 0)
            return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public List<String> getList() {
        return list;
    }

    public int getNumber() {
        return number;
    }
}
