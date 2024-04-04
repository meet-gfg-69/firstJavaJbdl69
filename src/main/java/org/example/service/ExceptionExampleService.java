package org.example.service;

public class ExceptionExampleService {

    /**
     * Error -> App cannot recover
     * Exception -> App can continue after handling the exceptions
     *
     * 2 types of exceptions
     * 1/ Compile time -- Checked exceptions
     * 2/ Run time  -- unchecked exceptions
     *
     *
     * 1. Try- catch  -> try block runs the code which may occur into exception. And catch will handle if exception occurs
     * 2. Finally keyword -> finally will be executed irrespective of both try or catch.
     * 3. Throw -> To throw a exception
     * 4. Throws -> a warning that the method can throw or result into exception.
     * */


    public static void main(String[] args) {
        int a = sample(6,0);
        System.out.println(a);
        System.out.println("application end here");
    }


    public static int sample(int a , int b) {
        try{
            return a/b;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        return a;
    }

}
