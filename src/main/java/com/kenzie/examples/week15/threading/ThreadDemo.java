package com.kenzie.examples.week15.threading;

public class ThreadDemo {
    public static void main (String [] args) throws InterruptedException {
        MyThread mt = new MyThread ();
        MyThread mt2 = new MyThread ();
        System.out.println("Phase 1:");
        System.out.println(mt.getState());
        System.out.println(mt2.getState());

        mt.start ();
        System.out.println("Phase 2:");
        System.out.println(mt.getState());
        System.out.println(mt2.getState());

        mt2.start ();
        System.out.println("Phase 3:");
        System.out.println(mt.getState());
        System.out.println(mt2.getState());

        for (int i = 0; i < 50; i++)
            System.out.println ("i = " + i + ", i * i = " + i * i);


        System.out.println("Phase 4:");
        System.out.println(mt.getState());
        System.out.println(mt2.getState());
    }
}
class MyThread extends Thread
{
    public void run ()
    {
        for (int count = 1, row = 1; row < 20; row++, count++)
        {
            for (int i = 0; i < count; i++) {
                System.out.println(i);
            }
            System.out.print ('\n');
        }
    }
}

