package com.kenzie.examples.week26.executor;

public class RunnableDemo {

    public static void main(String[] args)
    {
        System.out.println("Main thread is- "
                + Thread.currentThread().getName());
        Thread t1 = new Thread(new RunnableDemo().new RunnableImpl());
        t1.start();

       Thread t2 = new Thread(new RunnableDemo().new RunnableImpl());
        t2.start();
        Thread t3 = new Thread(new RunnableDemo().new RunnableImpl());
        t3.start();
        Thread t4 = new Thread(new RunnableDemo().new RunnableImpl());
        t4.start();
        Thread t5 = new Thread(new RunnableDemo().new RunnableImpl());
        t5.start();


    }

    private class RunnableImpl implements Runnable {

        public void run()
        {
            System.out.println(Thread.currentThread().getName()
                    + ", executing run() method!");

            //throw new FileNotFoundException();

            /**
             * Checked exception can't be thrown, Runnable must
             * handle checked exception itself.
             */

            /**
             * Checked exception can't be thrown, Runnable must
             * handle checked exception itself.
             */


            int r = 1 / 0;
            /*
             * Below commented line is an example
             * of thrown RuntimeException.
             */
            // throw new NullPointerException();


        }
    }
}

