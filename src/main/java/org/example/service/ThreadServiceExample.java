package org.example.service;

import org.example.domain.MyCallableTask;
import org.example.domain.MyThread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadServiceExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {


        Integer m= 10;
        AtomicInteger b = new AtomicInteger(15);


        System.out.println("starting here");
        long start=System.currentTimeMillis();

        System.out.println("name of the thread: "+Thread.currentThread().getName());

        MyThread t1=new MyThread();


       // t1.start();


        MyThread t2=new MyThread();


      //  t2.start();

        MyThread t3=new MyThread();


//        t3.start();
//
//
//        t1.join();
//        t2.join();
//        t3.join();



        ExecutorService service =Executors.newFixedThreadPool(3);



       Future<Integer> aFuture =service.submit(() -> {

                return getMyInteger();
        });

        Future<Integer> bFuture =service.submit(() -> {

            return getMyInteger();
        });

        Future<Integer> cFuture =service.submit(() -> {

            return getMyInteger();
        });


//        int a = aFuture.get();
//        int b= bFuture.get();
//        int c= cFuture.get();
//        System.out.println(a+b+c);




        CompletableFuture<Integer> aCompFuture=CompletableFuture.supplyAsync(
                () -> {
                   try {
                       return getMyInteger(); // return 1;
                   }catch (FileNotFoundException ex){
                       System.out.println("I faced exception");
                       return 1;
                   }

                } // 1000 secs
        ).thenApplyAsync((a) -> {
            System.out.println(a+1);
            return a+1;
        }).thenApplyAsync((a) -> {
            System.out.println(a+1);
            return a+1;
        }).thenApplyAsync((a) -> {
                    System.out.println(a+1);
                    return a+1;
        });

        int finalValue=aCompFuture.get();
        System.out.println(finalValue);

        long end=System.currentTimeMillis();

        System.out.println("Time taken: "+(end-start));

       // System.out.println(a);
        service.shutdown();


    }


    public static Integer getMyInteger() throws FileNotFoundException  {
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }

       Boolean n= new Random().nextBoolean();
        if(n){
            throw new FileNotFoundException();
        }
        System.out.println("Here after exceptions");

        return 1;
    }





}
