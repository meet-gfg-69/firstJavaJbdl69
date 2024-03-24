package org.example.domain;

public interface CompanyCar extends Car {

    void openAirBag();
    void closeAirBag();

    default void addFrontLogo(int name){
        System.out.println("I am coming from interface with default method");
    }

}
