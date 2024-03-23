package org.example.inheritance;

public class TestClass {


    public static void main(String[] args) {

        ACar car1=new ACar();
        car1.addFrontLogo();
        car1.addFrontLogo(1);
        car1.addFrontLogo("abc");

        ACarPlus aCarPlus=new ACarPlus();
//        aCarPlus.sunRoof();
          aCarPlus.start();
//        aCarPlus.stop();

        ACar aCar=new ACarPlus();
        aCar.start();



//        ACarPlus car2=new ACar();
//        ACar car3=new ACarPlus();


        /**
         * B extends A
         * * */
         ClassA a=new ClassA();
         ClassB b=new ClassB();
         ClassA a1=new ClassB(); // -> possible
       //  ClassB b2=new ClassA();  // -> not possible

         a.a=10;
         b.a=15;
         b.b=20;
         a1.a=10;
        // a1.b=10  -> despite memory and constructor of ClassB, a1 cannot refer to b.
       // b2.a=10;
       // b2.b=15; -> no memory created for b of b2 because constructor of ClassA ;



    }
}
