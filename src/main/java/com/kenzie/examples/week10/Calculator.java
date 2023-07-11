package com.kenzie.examples.week10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Calculator {

    public static void main(String[] args)  {

        try {
            FileInputStream fileStream = new FileInputStream("myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
           // fileStream.close();
        }
        int num1 = 10;
        int num2 = -5;

        try {
            int result = divide(num1,num2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        int result2 = 0;
        try {
            result2 = divide3(10, 20);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }


//        int result =0;
//        try {
//            result = num1 / num2;
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        System.out.println(result);

        ArrayList<String> list = new ArrayList<>();
        list = null;
        try {
            list.add("test");

        }
        catch(NullPointerException e){
            list = new ArrayList<>();
            e.printStackTrace();
        }
        finally{
            list.add("finish");
        }

//
//        String[] array = new String[5];
//        array[6] = "test";
//
        System.out.println("This is the end!");
    }

    static int divide(int num1, int num2) throws IllegalArgumentException{
        if(num1 < 0 || num2 < 0){
            throw new IllegalArgumentException("No negative parameters please");
        }
        return num1 / num2;
    }

    static int divide2(Integer num1, Integer num2) {
        int result = 0;
        try{
            result = num1/num2;
        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        return result;
    }

    static int divide3(Integer num1, Integer num2) throws ArithmeticException,NullPointerException{
       return num1/num2;
    }
}
