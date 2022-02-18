package com.kenzie.examples.bigo;

public class CompareBigODemo {

    public static int addUpToFirst(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;

    }
    //O(n)

    public static int addUpToSecond(int n) {
        return n * (n + 1) / 2;
    }
    //O(1)

    public static void main(String[] args){
        System.out.println(addUpToFirst(4));
        System.out.println(addUpToSecond(4));

    }
}
