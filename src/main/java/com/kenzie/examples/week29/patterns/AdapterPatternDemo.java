package com.kenzie.examples.week29.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdapterPatternDemo {

    public static void main(String[] args) throws IOException {
        //buffered reader expects a character stream
        //whereas system.in expects a byte stream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s = br.readLine();
        System.out.print("Entered input: " + s);
    }
}
