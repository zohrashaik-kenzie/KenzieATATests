package com.kenzie.examples.week8;

public enum Years {
    TwentyOne(2021),
    TwentyTwo(2022),
    TwentyThree(2023);

    public int getYear() {
        return year;
    }

    int year;

    Years(int i) {
        this.year = i;
    }

    public static void main(String[] args){

          System.out.println(Years.TwentyTwo.getYear());

    }
}
