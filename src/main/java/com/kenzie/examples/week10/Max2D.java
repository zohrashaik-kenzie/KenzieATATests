package com.kenzie.examples.week10;

public class Max2D {
    public static void main(String[] args) {

        int[] row11 = {4, 2, 9, 10};
        int[] row21 = {6, 3, 7, 8};
        int[] row31 = {2, 9, 9, 5};

        int[][] twoDArray2 = {
                row11, row21, row31
        };

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < twoDArray2.length; i++) {
            for (int j = 0; j < twoDArray2[i].length; j++) {
                if(max < twoDArray2[i][j]){
                    max = twoDArray2[i][j];
                }
            }
        }

        System.out.println("Max = " + max);
    }
}
