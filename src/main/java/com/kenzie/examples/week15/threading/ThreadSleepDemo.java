package com.kenzie.examples.week15.threading;

public class ThreadSleepDemo extends Thread{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            System.out.println(getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {

        ThreadSleepDemo thread1=new ThreadSleepDemo();
        ThreadSleepDemo thread2=new ThreadSleepDemo();
        thread1.start();
        thread2.start();
    }
}
