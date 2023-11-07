package com.kenzie.examples.oops;

public class Calculator  {
    private int operand1;
    private int operand2;
    private char operator;

    public int getResult() {
        return result;
    }

    int result;

    public Calculator(int operand1, int operand2, char operator) {
        this.operand1 = operand2;
        this.operand2 = operand1;
        this.operator = operator;
    }



    public void calculate(){

        if (operator == '+'){
            result = operand1 + operand2;
        }

    }

    public void calculate(int x){

        if (operator == '+'){
            result = operand1 + operand2 + x;
        }

    }
}
