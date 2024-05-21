package com.kenzie.examples.week16.functionalinterface;

import java.io.IOException;
import java.io.PrintWriter;
@java.lang.FunctionalInterface
public interface IFunctionalInterface {
    public void execute(int x);
    public default void print(String text) {
        System.out.println(text);
    }

    public static void print(String text, PrintWriter writer) throws IOException {
        writer.write(text);
    }
}
