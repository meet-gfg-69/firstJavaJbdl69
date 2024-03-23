package org.example.inheritance;

public class ACar implements CompanyCar , CompanyCarTwo{

    public void openAirBag(){
        System.out.println("I am coming from class A");
    }
    public void closeAirBag(){
        System.out.println("I am coming from class A");
    }


    public void addFrontLogo() {
        //logic specific to ACar
        System.out.println("I am from ACar class");
    }

    public void addFrontLogo(int a) {
        //logic specific to ACar
        System.out.println("I am from ACar class with int and overriding the CompanyCar");
    }

    @Override
    public void moveForward() {

    }

    @Override
    public void moveBackward() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void start() {
        System.out.println("logic for start with key stroke");

    }
}
