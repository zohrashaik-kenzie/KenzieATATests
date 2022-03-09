package com.kenzie.examples.exceptions;

import java.io.IOException;

class PropagatingException{
    void m() throws IOException {
        throw new java.io.IOException("device error");//checked exception
    }
    void n() throws IOException {
        m();
    }
    void p() throws IOException {
            n();
    }
    public static void main(String args[]) throws IOException {
        PropagatingException obj=new PropagatingException();
        obj.p();
        System.out.println("normal flow");
    }
}