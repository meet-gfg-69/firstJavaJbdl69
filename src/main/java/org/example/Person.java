package org.example;

public class Person {


    private static int a=10;
    private String name;
   private int age;
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
        this.age = age;
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
     * 4. Polymorphism
     *
     *
     *
     * */
}
