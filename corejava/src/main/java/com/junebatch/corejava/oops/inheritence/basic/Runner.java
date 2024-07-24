package com.junebatch.corejava.oops.inheritence.basic;

public class Runner {

    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m2();

        System.out.println("----------------------");
        A a = new B();
        a.m1();
        a.m3();

         /*
             B     --> A     ---> NewObject
                       m1()        m1()
          */



    }
}
