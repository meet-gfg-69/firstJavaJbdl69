package org.example.service;

import org.example.domain.ACar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {

        List<Number> numberList=new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3.0);
        numberList.add(4.0f);
        numberList.add(5l);
        System.out.println(numberList.get(0));
        addNumbers(numberList);

        List<Integer> numberList2=new LinkedList<>();
        numberList2.add(3);
        numberList2.add(4);
        numberList2.remove(0);
        addNumbers(numberList2);

        List<Number> myNumberList=new LinkedList<>();
        myNumberList.addAll(numberList2); //allowed because Integer is extending the number

        myNumberList.addAll(numberList); // allowed because Number is also allowed by itself

        List<Integer> myIntegerList=new LinkedList<>();
        myIntegerList.addAll(numberList2); //allowed because Integer is extending the number

        //myIntegerList.addAll(numberList); // not allowed because Number does not extend integer.

        System.out.println(numberList2);
    }

    public static <Number> void addNumbers(List<Number> numberList){
//        int count=0;
//
//        for(int i=0;i<numberList.size();i++)
//        {
//            count+=numberList.get(i);
//        }
//
//        for(Integer i:numberList){
//            System.out.println(i);
//        }
//        System.out.println(count);
    }



    /****
     *  1. searching a list with ID and returning an output - arrayList -> direct index
     *  2. one by one entry to store the student data -> LinkedList -> unknown capacity and dynamic allocation is easier in linkedlist
     *
     * */

}
