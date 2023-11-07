package com.kenzie.examples.week10;

public class Max2D {
    public static void main(String[] args) {

        int[] row11 = {4, 2, 9, 10};
        int[] row21 = {6, 3, 7, 8};
        int[] row31 = {2, 9, 9};
        int[] row41 = {1,4};

        int[][] twoDArray2 = {
                row11, row21, row31,row41
        };

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < twoDArray2.length; i++) { //0,1,2,3
            for (int j = 0; j < twoDArray2[i].length; j++) { //i =0, j=0,1,2,3;i=1, j=0,1,2,3; i=2, j=0,1,2
                if(max < twoDArray2[i][j]){
                    max = twoDArray2[i][j]; //10
                }
                   System.out.print(twoDArray2[i][j] +  " ");
            }
            System.out.println();
        }

        System.out.println("Max = " + max);



    }



}
