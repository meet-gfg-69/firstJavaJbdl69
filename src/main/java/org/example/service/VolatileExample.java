package org.example.service;

public class VolatileExample {
    // Java Program to demonstrate the
// use of Volatile Keyword in Java

    /**
     * https://www.geeksforgeeks.org/volatile-keyword-in-java/
     *
     *
     * Volatile: indicates the JVM to not allow threads to cahce the attribute, rather always read from the main memory
     *
     * In J 1.8 we uses Atomic types like: AtomicInteger,AtomicLong.. to achieve the same task
     * and internally uses Volatile keyword itself.
     *
     * */

    private static volatile int MY_INT = 0;

    public static void main(String[] args)
    {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override public void run()
        {
            int local_value = MY_INT;
            while (local_value < 5) {
                if (local_value != MY_INT) {
                    System.out.println(
                            "Got Change for MY_INT : {0}"+
                                    MY_INT);
                    local_value = MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override public void run()
        {
            int local_value = MY_INT;
            while (MY_INT < 5) {
                System.out.println("Incrementing MY_INT to {0}"+
                        local_value + 1);
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
