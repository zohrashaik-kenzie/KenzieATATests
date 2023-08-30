package com.kenzie.examples.term1week3;

import java.util.Scanner;

public class Calculator {

    /**
     * Enter the operands
     * Enter the operators a, b
     * if operator equals +
     *   return a + b
     * else if operator equals -
     *    return  a-b
     */

    public static void main(String[] args){

        //enter the operator
        System.out.println("Enter the operator");


        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();

        //enter the operands a, b

     //   int[] operandsArray = new int[5];

        while(!operator.equals(".")) {
            System.out.println("Enter the first operand");
            int a = scanner.nextInt();

            System.out.println("Enter the second operand");
            int b = scanner.nextInt();

            //* if operator equals +
            //     *   return a + b

            System.out.print(a + " " + operator + " " + b + " = ");
            if (operator.equals("+")) {
               // System.out.println(add(a,b,10));
            } else if (operator.equals("-")) {
               // System.out.println(sub(a,b));
            } else if (operator.equals("*")) {
                System.out.println(a * b);
            } else if (operator.equals("/")) {
                System.out.println(a / b);
            } else if (operator.equals("^")) {
                System.out.println(a ^ b);
            }
         //   scanner = new Scanner(System.in);
            System.out.print("Enter the operator");
            operator = scanner.nextLine();


        }

    }
    public  int add(int num1, int num2){
        return num1 + num2;
    }

    public  int sub(int x, int y){
        return x - y;
    }

    public static int  mul(int x,int y){
        return x * y;
    }
}
