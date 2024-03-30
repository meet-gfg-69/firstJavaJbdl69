package org.example.service;

@FunctionalInterface
public interface MyFunctionalInterface {

    public void doSomethingWithNumber(int x,int y);

    default public  void sayHello(){
        System.out.println("Hello");
    }

    static public void sayHi(){
        System.out.println("Hi");
    }



}


/***
 *
 *  supplier  -> which will not accept anything, but will give the data  ->  instagram or content feed.
 *  consumer  -> which will accept the parameter and will not return anything -> data analytics, form submit
 *  predicate  -> which will accept the parameter and will return any parameter ->
 *
 *
 *
 * */