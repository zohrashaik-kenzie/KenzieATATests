package com.kenzie.examples.mutable;

public class StackClass {
        public static int multiplyInt(int data) {
            data = 15;
            int newValue = data * 2;
            return newValue;
        }
        public static void main(String[] args) {
            int value = 13;
           multiplyInt(value);
            return;
        }

}
