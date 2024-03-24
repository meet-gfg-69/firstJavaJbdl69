package org.example.service;

import org.example.exception.MyCustomException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

    public static void main(String[] args)  {
        try {


            int a = sample(6, 0);
            System.out.println(a);
        } catch (MyCustomException e) {

            e.printStackTrace();
        }

        System.out.println("application end here");
        sample2("test.txt");
        sample2("test2.txt");
    }


    public static int sample(int a , int b) throws MyCustomException {
        if(b == 0){
            throw new ArithmeticException();
        }
        try{
            Integer k = null;
            k=k+10;
            int[] b1 = new int[10];
            System.out.println(b1[12]);
            return a/b;
        }
        catch(ArithmeticException e){
            System.out.println("exception while dividing");
        }catch(NullPointerException ex){
            System.out.println("exception while checking");
        } catch (Exception ex){
            System.out.println(ex.getClass());
            System.out.println("the last block");
        }

        return a;
    }

    public static void sample2(String fileName) throws MyCustomException {
        System.out.println("hello");
        File f=new File(fileName);
        //BufferedReader bf=new BufferedReader(new FileReader(f));



    }
}


/***
 *1. Error -> application cannot recover from
 *2. Exception  -> application can recover from
 *    1. Checked Exception - compile time -> needs to handled by developer or thrown to callers.
 *    2. unchecked Exception - runtime exception -> no mandate to handle it. Good to handle to avoid application crash.
 *
 *    try {
 *        // a code block where you might expect a problem
 *    }catch(Exception e){
 *        // log the exception for developers to fix
 *    }finally{
 *        // clean up
 *    }
 *
 *    throw -> Keyword to throw an exception when a particular condition occurs.
 *    throws -> Keyword used as a warning to calling method that the method call may result into exception.
 *
 *    try with resource -> close the resources automatically
 * */



/*
* 1.  click on complete order
* 2. it asks your payment
* 3. a card payment
* 4. card details
* 5. card pin/otp
* 6. payment successfull
* 7. order placed
*
*
*
* OrderService
*
* /// preorder
* reduce the item inventory
* try{
* Paymentresponse paymentService.proceedPayment(); // since throws in used in the mehtod declaration of the service, it will force us to handle in try catch here.
* }catch(IncompletePaymentException e){
    // cancel the order
    *
}
* // place dispatch order for user.
*
*
*
* PaymentResponse PaymentService{
*
*
* public void proceedPayment() throws IncompletePaymentException{
* // accept card number/
* int counter = 0;
*
* try{
* //accept card number
* // accept pin
* // perform bank transaction
*
* }catch(Invalid card number exception ){
* counter++
* if(counter > 3)
*   throw IncompletePaymentException();
* //retry to ask valid number
* }catch(Invalid pin exception ){
* counter++
* if(counter >3)
* throw IncompletePaymentException();
    //retry asking pin/otp again
}
* catch(PaymentDeclined exception){
*
* throw IncompletePaymentException();
*
* }
*
* */

































