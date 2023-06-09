package com.kenzie.examples.week6;

public class ComplexHelper {

    public static ComplexNumber add(ComplexNumber complexNumber1, ComplexNumber complexNumber2){

        //  30 + 5i
        // 15 + 11i
        // add 45 + 16i
        int real_part = complexNumber1.getReal_part() + complexNumber2.getReal_part();
        int imaginary_part = complexNumber1.getImaginary_part() + complexNumber2.getImaginary_part();
        ComplexNumber result = new ComplexNumber(real_part,imaginary_part);
        return result;
    }

}
