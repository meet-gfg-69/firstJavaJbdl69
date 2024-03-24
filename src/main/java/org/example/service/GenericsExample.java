package org.example.service;

import org.example.domain.ACar;
import org.example.domain.ACarPlus;
import org.example.domain.BCar;
import org.example.domain.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsExample {

    static class Box<T,E>{
        T a;
        E b;
    }


    public static void main(String[] args) {

        Box<String,Integer> stringBox=new Box<>();
        stringBox.a="hello";
        stringBox.b=10;
        String newString= stringBox.a;
        System.out.println(newString);

        Box<Integer,Integer> intBox=new Box<>();
        intBox.a=10;
        intBox.b=20;


        List<Car> carList=new ArrayList<>();
        carList.add(new ACar());
        carList.add(new BCar());
        carList.add(new ACarPlus());

        List<ACar> aCarList=new ArrayList<>();
        aCarList.add(new ACar());
        aCarList.add(new ACar());

        List<BCar> bCarList=new ArrayList<>();
        bCarList.add(new BCar());
        bCarList.add(new BCar());

        startCars(aCarList);
        startCars(bCarList);

        List<Integer> integerList=new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // startCars(integerList);  --> Integer does not have superclass Car hence method will not accept it.

        /***
         * in perpective of collection
         *
         * add in collection -> collection consuming data
         * get from collection -> collection producing data
         * PECS -> producing use extends and consuming use super
         * CSPE -> consuming use Super and producing use extends
         *
         * */
        List<? super ACar> carList2=new ArrayList<>();
//        carList2.add(new ACar());
//        carList2.add(new BCar());
//        carList2.add(new ACarPlus());
//
//        ACarPlus carPlus=new ACar();

        ACar aCar=new ACarPlus();

       /*
        extend will not work at the adding.
        List<? extends Car> carList3=new ArrayList<>();
        carList3.add(new ACar());
        carList3.add(new BCar());
        carList3.add(new ACarPlus());

        */

      /*
        Super will not work in time getting the data from collection
       List<? super Car> carList4=new ArrayList<>();
        Car car1=carList4.get(0);
        ACar aCar=carList4.get(0);*/

        List<? extends  ACar> carList5=new ArrayList<>();
        Object carObject=carList5.get(0);
        Car car=carList5.get(0);
      //  ACar aCar=carList5.get(0);
//        ACarPlus aCarPlus=carList5.get(0);
//        BCar bCar=carList5.get(0);
//
//        ACar acar=new ACarPlus();
//
//        ACarPlus carPlus=new ACar();




    }

    public static <T> void startCars(List<? extends Car> carList){
        for (Car car : carList) {
            car.start();
        }
    }
    public static <T> void add(T a, T b){
        System.out.println(a);
        System.out.println(b);
        // System.out.println(a+b);
    }

    /*
    **
    * Invariance - > the exact data type that u can pass in generic class
    * Covariance  > either the T or children of T -> T is upperbound
    * Contravariance -> either the T or parents of T -> T is lowerbound
    * */


}
