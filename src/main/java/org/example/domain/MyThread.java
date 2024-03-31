package org.example.domain;

import java.sql.Connection;

public class MyThread extends Thread {


    Connection connection;



    @Override
    public void run() {

//result=connection.execute(query);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        printMyName();
    }

    private void printMyName(){
        System.out.println("Hello from MyThread"+Thread.currentThread().getName());
    }
}
