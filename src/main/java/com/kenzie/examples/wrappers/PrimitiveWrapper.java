package com.kenzie.examples.wrappers;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveWrapper {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        Integer wrapperInteger = Integer.valueOf(22);

        int primitiveInt = Integer.parseInt("22");
        String str = wrapperInteger.toString();


    }
}
