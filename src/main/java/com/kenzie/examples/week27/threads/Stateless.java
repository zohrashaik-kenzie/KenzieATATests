package com.kenzie.examples.week27.threads;

import java.math.BigInteger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Stateless {


    public  BigInteger factorial(int number) throws InterruptedException {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= number; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    private static void printFactorial(int number) throws InterruptedException {
        System.out.println("Factorial of : " + number + " is: " + new Stateless().factorial(number));

    }

    public static void main(String[] args) throws InterruptedException {

       ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 0,
                TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());


        for (int i = 1; i <= 15; i++) {
            threadPoolExecutor.execute(getRunnable(i));
        }

        threadPoolExecutor.shutdown();

    }

    private static Runnable getRunnable(int i) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    printFactorial(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        return runnable;
    }
}

