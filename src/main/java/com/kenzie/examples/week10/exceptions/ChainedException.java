package com.kenzie.examples.week10.exceptions;

public class ChainedException
{
    static void chained()
    {
        ArithmeticException a = new ArithmeticException();
        StringIndexOutOfBoundsException b = new StringIndexOutOfBoundsException();
        ArrayStoreException c = new ArrayStoreException();

        Throwable t1 = b.initCause(a); // t1 is an object of type Throwable class. The initCause() method returns reference to Throwable class type and stored in a variable t1.

        Throwable t2 = c.initCause(b); // t2 is an object of type Throwable class.

        //System.out.println(b.getCause()+ " caused \n" +b);
        System.out.println(c.getCause() + " caused \n" +c);
    }
    public static void main(String[] args)
    {
        chained();
    }
}