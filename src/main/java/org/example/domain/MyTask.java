package org.example.domain;

public class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from MyTask"+Thread.currentThread().getName());
    }
}
