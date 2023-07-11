package com.kenzie.examples.week10;

public class TwoDDemo {


    public static void main(String[] args) {
        int[] row1 = {1, 3, 2, 4};
        int[] row2 = {1, 3, 1, 5};
        int[] row3 = {4, 7, 7, 6};

        int[][] twoDArray1 = {
                row1, row2, row3
        };

        int[] row11 = {4, 2, 9, 10};
        int[] row21 = {6, 3, 7, 8};
        int[] row31 = {2, 9, 9, 5};

        int[][] twoDArray2 = {
                row11, row21, row31
        };

        int[][] twoDArrayResult = new int[3][4];

        for (int i = 0; i < twoDArray1.length; i++) {
            for (int j = 0; j < twoDArray2[i].length; j++) {
                twoDArrayResult[i][j] = twoDArray1[i][j] + twoDArray2[i][j];
            }
        }
        for (int i = 0; i < twoDArrayResult.length; i++) {
            for (int j = 0; j < twoDArrayResult[i].length; j++) {
                System.out.print(twoDArrayResult[i][j] + " ");
            }
            System.out.println();
        }
    }
}
