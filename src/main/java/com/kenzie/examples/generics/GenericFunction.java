package com.kenzie.examples.generics;

import com.kenzie.examples.polymorphism.Rectangle;

public class GenericFunction {


        // A Generic method example
        static <T> void genericDisplay(T element)
        {
            System.out.println(element.getClass().getName()
                    + " = " + element.toString());
        }

        // Driver method
        public static void main(String[] args)
        {
            // Calling generic method with Integer argument
            genericDisplay(11);

//            // Calling generic method with String argument
           genericDisplay("SEBD Advanced ATA Course");
//
//            // Calling generic method with double argument
            genericDisplay(3.0);

            //add our class here
            genericDisplay(new Rectangle(2,3));
        }
    }

