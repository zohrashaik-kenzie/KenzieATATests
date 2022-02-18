package com.kenzie.examples.bigo;

public class BigODemo {

    public static void printFirstItem(int[] items) {
        System.out.println(items[0]);
    }

    public static void printAllItems(int[] items) {
        for (int item : items) {
            System.out.println(item);
        }
    }



    public static void printAllPossibleOrderedPairs(int[] items, int[]items2) {
        for (int firstItem : items) {
            for (int secondItem : items2) {
                System.out.println(firstItem + ", " + secondItem);
            }
        }
    }
    //O(m*n)

    public static void main (String[] args){
        int[] items = {1,2,3,4};//m
        int[] items2 = {1,2,3,4,5};//n
       // printFirstIem(item
        //printAllItems(items);
        // printAllPossibleOrderedPairs(items);

    }


}
