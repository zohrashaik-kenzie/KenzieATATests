package com.kenzie.examples.week15.threading;

public class ThreadRunDemo implements Runnable{
    public void run()
    {
        System.out.println("Thread is running...");
    }
    public static void main(String args[])
    {
        ThreadRunDemo r1=new ThreadRunDemo();
        Thread thread1 =new Thread(r1);
        thread1.start();
    }
}

