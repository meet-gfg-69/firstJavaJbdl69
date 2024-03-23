package org.example;

public class Main {
     public static void main(String[] args) {
        System.out.println("Hello world!");


         Person p = new Person("john",20);
         System.out.println(p.isAdult());
         p.setAge(10);
         p.age=-100;
         System.out.println(p.isAdult());


         BankAccount bankAccount=new BankAccount("Max");

         bankAccount.deposit(10000.00);
         System.out.println(bankAccount.getBalance());
         bankAccount.withdraw(5000.00);
         System.out.println(bankAccount.getBalance());
        //demo(); -> will throw an error as demo is not static.
         p.incrementA();
         p.incrementA();
         System.out.println(p.getA());



    }

    public  void demo(){

    }

    Main(String abc){
        System.out.println(abc);

    }

    static class subclass{
         String deptName;
    }
}








/***
 *  .java file
 *  .class file
 *  byte code
 *   java -> javac -> jvm -> processor
 *
 *
 *   stack where the reference is stored
 *   heap where the value is stored
 *
 *
 * new -> creates an object and assign the memory and returns the reference stored in stack
 *
 * Garbage collector -> which release the memory clean the object from heap
 *
 * Person p = new Person(); -> new space allocated for person p.
 *
 * p = null; p as reference is removed from stack.
 *  */

/** *
 *
 * Types of Garbage collectors :
 *
 *
 * 1. serial GC -> single-threaded collector that pauses all application threads during garbage collection.
 * 2. parallel GC ->  uses multiple threads to perform garbage collection concurrently with the application.
 *
 * - high through put
 *
 *  z gc -> designed to keep pause times consistently low, even with very large heap sizes (multi-terabyte).
 *  Shenandoah  GC -> designed to provide consistently low pause times, even with large heap sizes.
 *
 *  low latency less throughput
 *
 *
 **/

/**
 *
 * int, float, double , boolean -> primitive data types
 *
 * String -> Object in Java
 *
 * Person, Car, List, Stack, Queue -> Object in Java
 */

/***
 *
 * Static members belongs to class and only exist at class level and non-static attributes are part of each object.
 *
 * Hence, static members are shared among all objects as a single entity.
 *
 * Static member can access only other static member and cannot access any non-static attribute because non-static can exist only if object exists.
 *
 * While all non-static member can access static because it belongs to their class and for sure tend to exist.
 * */














