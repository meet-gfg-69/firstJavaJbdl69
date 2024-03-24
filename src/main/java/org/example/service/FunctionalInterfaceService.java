package org.example.service;

import java.util.Random;

public class FunctionalInterfaceService {

    public static void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface = (x,y) -> System.out.println(x+y);
        myFunctionalInterface.doSomethingWithNumber(10,20);

        myFunctionalInterface=(x,y) -> System.out.println(x-y);
        myFunctionalInterface.doSomethingWithNumber(10,20);

        MyFunctionalInterface myFunctionalInterface1= (a,b) -> {
            System.out.println(a+b);
        };
        myFunctionalInterface1.doSomethingWithNumber(10,20);

        myFunctionalInterface1= (x,y) -> System.out.println(x-y);
        myFunctionalInterface1.doSomethingWithNumber(10,20);

        MyFunctionalInterfaceTwo myFunctionalInterfaceTwo=() -> System.out.println("hello");
        myFunctionalInterfaceTwo.doSomething();

        MyFunctionalInterfaceThree myFunctionalInterfaceThree = () -> {return new Random().nextBoolean();};
        boolean a = myFunctionalInterfaceThree.doSomething();
        System.out.println(a);

        MyFunctionalInterfaceFour myFunctionalInterfaceFour =(x) -> {return x*x;};

        int squared=myFunctionalInterfaceFour.doSomething(5);
        System.out.println(squared);




    }
}
