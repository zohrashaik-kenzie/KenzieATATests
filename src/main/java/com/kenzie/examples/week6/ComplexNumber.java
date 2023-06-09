package com.kenzie.examples.week6;

public class ComplexNumber {

    private int real_part;
    private int imaginary_part;

    public ComplexNumber(int real_part, int imaginary_part) {
        this.real_part = real_part;
        this.imaginary_part = imaginary_part;
    }

    public int getReal_part() {
        return real_part;
    }

    public int getImaginary_part() {
        return imaginary_part;
    }

    @Override
    public String toString() {

        //real_part + imaginary_parti
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(real_part);
        sBuilder.append("+");
        sBuilder.append(imaginary_part);
        sBuilder.append("i");
        return sBuilder.toString();
    }

    public ComplexNumber add(ComplexNumber complexNumber2){

        //  30 + 5i
        // 15 + 11i
        // add 45 + 16i
        int real_part = this.real_part + complexNumber2.real_part;
        int imaginary_part = this.imaginary_part + complexNumber2.imaginary_part;
        ComplexNumber result = new ComplexNumber(real_part,imaginary_part);
        return result;
    }


    public static void main(String[] args){

        //30+5i
        ComplexNumber cNumber1 = new ComplexNumber(30,5);
        System.out.println(cNumber1.toString());

        //15 + 11i
        ComplexNumber cNumber2 = new ComplexNumber(15,11);
        System.out.println(cNumber2.toString());

        ComplexNumber cNumber3 = cNumber1.add(cNumber2);
        System.out.println(cNumber3.toString());

        ComplexNumber cNumber4 = cNumber2.add(cNumber3);
        System.out.println(cNumber4.toString());

        ComplexNumber cNumber5 = ComplexHelper.add(cNumber1, cNumber4);
        System.out.println(cNumber5.toString());

    }
}
