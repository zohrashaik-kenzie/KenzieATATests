package com.kenzie.examples.bigo;

public class BigOConstantsDemo {
    public static void printAllItemsTwice(int[] items) {
        for (int item : items) {
            System.out.println(item);
        }
        //O(n)

        // once more, with feeling
        for (int item : items) {
            System.out.println(item);
        }

        //O(2n) which is just O(n)
    }

    public static void printFirstItemThenFirstHalfThenSayHi100Times(int[] items) {
        System.out.println(items[0]);
        //O(1)
        int middleIndex = items.length / 2;
        int index = 0;

        while (index < middleIndex) {
            System.out.println(items[index]);
            index++;
        }
        //O(n/2) O(n)

        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
        }
        //O(100) O(1)

        // O(1 + n/2 + 100)O(1+n/2+100), which we just call O(n).
        // O(1 + n + 1) //O(n)
    }



}
