package com.junebatch.corejava.oops.polymorphism.runtimepolymoriphism.basic;

public class Runner {

    public static void main(String[] args) {
        A a = new A();
        a.m1(); //A-m1()  // normal method call

        B b = new B();
        b.m2();  //B-m2()   // normal method call
        b.m1();  //B-m1()   // closest ancestor method will be executed if it is not in the object itself


        System.out.println("------------------");
        A ab = new B();
        ab.m1(); //B-m1()



      //  ab.m2();  // compile time error



    }

    // public class C extends A{}

    /*
    A               B          B         B
    m1()            -          m1()      m1(), m2()...mn()

      A a = new B();
      a.m1();
     */
}
