package org.example.service;

public class ExceptionExampleService {
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
