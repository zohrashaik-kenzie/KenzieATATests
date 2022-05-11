package com.kenzie.examples.week15.threading;

public class ThreadExtendDemo extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        ThreadExtendDemo thread=new ThreadExtendDemo();
        thread.start();
    }
}
