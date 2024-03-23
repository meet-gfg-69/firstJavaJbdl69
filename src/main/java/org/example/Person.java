package org.example;

public class Person {


    private static int a=10;
    private String name;
    public int age;
    private boolean isAdult;

    public Person(String name, int age) {
        a++;
        this.name = name;
        this.age = age;
        if(age > 18 && age < 100){
            this.isAdult = true;
        }else{
            this.isAdult=false;
        }
    }

    public int getA(){
        return this.a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void incrementA(){
        a++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 100) {
            this.age = age;
        }
        else {
            throw  new IllegalArgumentException();
        }
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    /****
     * OOPS
     * 1. Data encapsulation
     *      4 types of access modifiers
     *        public -> accessible from anywhere
     *        private -> accessible only within the class
     *        protected -> accessible only within the class and subclasses
     *        default -> accessible only within the package
     * 2. Data hiding
     *
     * 3. Inheritance
     *
     *  Interface to class
     *      Car
     *      {
     *          // wheels
     *          // engine
     *          // body
     *
     *          moveForward();
     *          moveBackward();
     *          stop();
     *          start();
     *      }
     *
     *      class SampleCar implements Car
     *      {
     *
     *      }
     *
     *      interface Hyundai extends Car{
     *
     *          openAirBag();
     *          closeAirBag();
     *
     *      }
     *
     *      class I10 implements HyundaiCar{
     *          void start(){
     *                 //key stroke
     *      *      }
     *      }
     *      class I10Plus extends I10 {

            void start(){
                //button press
     *      }
     }
     *
     *
     * Class to Class
     *
     *
     *
     *
     *
     *
     *
     * 4. Polymorphism
     *
     *      Overloading/Compile time
     *          rules
     *          1.Method name should be same
     *          2.Types of parameters should be different
     *          3.Number of parameters should be different
     *          4.Order of parameters should be different
     *          5. -> Return type does not matter here
     *
     *      Overriding/Run time
     *
     *
     * Calculator
     * {
     *     addInteger(int a, int b)
     *     addDouble(double a, double b);
     *     addFloat(float a,float b);
     *     addString (String a , String b);
     *
     *     add(int a, int b)
     *    add(double a, double b);
     *     add(float a,float b);
     *      add(String a , String b);
     *
     *
     *
     * }
     *
     *
     *
     * */
}
