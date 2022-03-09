package com.kenzie.examples.exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {

    //
    public int checkException(int number, int divisor) throws FileNotFoundException {
        PrintWriter pw;
        pw = new PrintWriter("log.txt");
        return number;
    }
}
