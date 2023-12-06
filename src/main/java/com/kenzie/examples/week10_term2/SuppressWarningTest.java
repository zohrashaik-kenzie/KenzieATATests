package com.kenzie.examples.week10_term2;

    // Class 1
    class DeprecatedTest
    {
        @Deprecated
        public void Display()
        {
            System.out.println("DeprecatedTest display()");
        }
    }

    // Class 2
    public class SuppressWarningTest
    {
        // If we comment below annotation, program generates
        // warning
        @SuppressWarnings({"checked", "deprecated"})
        public static void main(String args[])
        {
            int x = 10;
            DeprecatedTest d1 = new DeprecatedTest();
            d1.Display();
        }
    }

