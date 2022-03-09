package com.kenzie.examples.exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo {

    public static void main(String[] args) {

//        int quotient = 0;
//        try {
//             quotient = 100 / 0;
//        }
//        catch(ArithmeticException ae){
//            System.out.println(ae.getMessage());
//            quotient = -1;
//        }
//        System.out.println("After the quotient");
//        quotient = quotient + 1;

//        int quotient = 100;
//         String string = null;
//         int str_len = 0;
//         try {
//             str_len = string.length();
//         }
//         catch(NullPointerException npe){
//             str_len = -1;
//         }
//
//         System.out.println(str_len);

//        //multiple catch clauses
//        try{
//            int a[]=new int[5];
//            a[4]=30/5;
//            Integer.parseInt("test");
//        }
//        catch(ArithmeticException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println("task1 is completed");}
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("task 2 completed");}
//        catch(NumberFormatException ee){
//             System.out.println("NumberFormatException");
//        }
//        catch(Exception ee){
//            System.out.println("Exception");
//        }
//          System.out.println("rest of the code...");
//    }
////
////
////        System.out.println("Continue with the program: quotient = " + quotient);
////        System.out.println("Continue with the program: string = " + string);

//
//        List<String> list = new ArrayList<>();
//        list.add("Jan");
//        list.add("Feb");
//        String march = "";
//        try {
//            march = list.get(2);
//        }
//        catch(IndexOutOfBoundsException ie){
//            march = "Mar";
//        }
//        System.out.println(march);
//
//        String test = "100x";
//        int i;
//        try {
//            i = Integer.parseInt(test);
//        }
//        catch(NumberFormatException nfe){
//            i=0;
//        }
//        System.out.println(i);

        //multiple catch clauses
//        try{
//            int a[]=new int[5];
//            a[5]=30/0;
//            Integer.parseInt("test");
//        }
//        catch(ArithmeticException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println("task1 is completed");}
//        catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
//          System.out.println("rest of the code...");
//    }


        // throw an object of user defined exception
        try {
            throw new UserDefinedException("This is user-defined exception");
        } catch (UserDefinedException e) {
            System.out.println(e.getMessage());

        }


//            CheckedException ce = new CheckedException();
//
//            int result = 0;
//            try {
//                result = ce.checkException(10, 0);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }

//        System.out.println("Result = " + result);
    }
    }


