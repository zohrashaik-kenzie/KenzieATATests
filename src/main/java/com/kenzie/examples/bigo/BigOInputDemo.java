package com.kenzie.examples.bigo;

public class BigOInputDemo {

    public static void sayHiNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("hi");
        }
        for (int i = 0; i < n; i++) {
            System.out.println("there");
        }
        //O(n)
    }

    public static void printAllItems(int[] items) {
        for (int item : items) {
            System.out.println(item);
        }
        //O(n)
    }

    public static void main(String[] args){
        int[] items = {1,2,3};
        sayHiNTimes(items.length);
        printAllItems(items);
    }
}

