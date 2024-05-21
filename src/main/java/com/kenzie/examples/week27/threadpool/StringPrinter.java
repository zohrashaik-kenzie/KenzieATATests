package com.kenzie.examples.week27.threadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class StringPrinter {

    private final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 0,
            TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

    public static void main(String[] args) {
        StringPrinter printer = new StringPrinter();
        printer.printString();
        printer.shutdown();
    }

    public void printString() {
        for (int i = 1; i <= 13; i++) {
            threadPoolExecutor.execute(getRunnable(i));
        }
        threadPoolExecutor.shutdown();
    }

    public void shutdown(){
        threadPoolExecutor.shutdown();
    }

    private Runnable getRunnable(final int i) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    String randomString = RandomClass.getRandomString(i);
                    System.out.println("String returned is :" + randomString);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        return runnable;
    }
}

