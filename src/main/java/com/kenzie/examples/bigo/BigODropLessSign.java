package com.kenzie.examples.bigo;

public class BigODropLessSign {
    public static void printAllNumbersThenAllPairSums(int[] numbers) {

         for(int i=0;i<100;i++)
             System.out.println(i);

         //O(1) O(1)
         for(int i=0;i<2*numbers.length;i++)
             System.out.println(i);

         //O(n) O(n)
        System.out.println("these are the numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
        // O(n)
        System.out.println("and these are their sums:");
        for (int firstNumber : numbers) {
            for (int secondNumber : numbers) {
                System.out.println(firstNumber + secondNumber);
            }
        }
        // O(n^2)

        //  O(n^2)
    }

    //Here our runtime is O(1+ 2n+ n + n^2) which we just call n^2
}
