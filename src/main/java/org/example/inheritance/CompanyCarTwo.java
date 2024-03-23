package org.example.inheritance;

public interface CompanyCarTwo {

    default void addFrontLogo(String name){
        System.out.println("I am coming from 2nd interface with default method");
    }

    void openAirBag();
    void closeAirBag();

}
