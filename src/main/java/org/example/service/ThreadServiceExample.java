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


    /**
     * 1. Concurrent
     * 2. parallel
     * 3. Async
     *
     *
     *
     * coding + music - parallel
     * coding + replying message on mobile - concurrent
     * code is compiling & went to collect a parcel -async
     * */

    /**
     *
     *    // Thread implements the runnable so it does not return anything, It fire and forget way.
     *
     *         /*The Runnable interface is a functional interface and has a single run() method which doesn't accept any parameters and does not return any values.
     *          * Since the method signature does not have the “throws” clause specified, there is no way to propagate further checked exceptions.
     *          *
     *          * The Callable interface is a generic interface containing a single call() method – which returns a generic value V:
     *          * Callable's call() method contains “throws Exception” clause so we can easily propagate checked exceptions further:
     *
     * Future are used for getting the output after the thread finishes the computation.
     * Ex:
     *  When any service is booked. we get a token(Future here in java) and we wait for our token number to come and get
     *  the service. Similar way Future ( intro in 1.5) waits and blocks the calling thread to get output when .get() is called
     *
     *  to avoid blocking in Java 1.8 Completable Future were introduced which implements Future and CompletionStage.
     *  It is a non-blocking call used with function which accepts consumer and supplier which needs to be processed after thread finishes
     *
     *  We use executorServices to manage thread rather than creating a custom new threads.
     *  ExecutorService is framework inbuilt to handle and limit the thread.
     *         * types of executors
     *             Single Thread Executor : A thread pool with only one thread. So all the submitted tasks will be executed sequentially. Method : Executors.newSingleThreadExecutor()
     *
     *             Cached Thread Pool : A thread pool that creates as many threads it needs to execute the task in parrallel. The old available threads will be reused for the new tasks. If a thread is not used during 60 seconds, it will be terminated and removed from the pool. Method : Executors.newCachedThreadPool()
     *
     *             Fixed Thread Pool : A thread pool with a fixed number of threads. If a thread is not available for the task, the task is put in queue waiting for an other task to ends. Method : Executors.newFixedThreadPool()
     *
     *             Scheduled Thread Pool : A thread pool made to schedule future task. Method : Executors.newScheduledThreadPool()
     *
     *             Single Thread Scheduled Pool : A thread pool with only one thread to schedule future task. Method : Executors.newSingleThreadScheduledExecutor()
     *
     *
     *
     *  Future cannot handle the checked exception while CompletableFuture are enhanced with handling the Checked exceptions.
     *
     * */








}
