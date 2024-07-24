package com.junebatch.corejava.classelements.constructor.basic.nestedcalls;

public class A {

    private String name = "Default value";


    public static void m1(){
        System.out.println("A-m1()");
    }

    public A() {
        this(1);
        String name = "local_variable";
        System.out.println("No-arg constructor started");
        System.out.println( this.name); // to access instance-variables
        this.m1(); //to access the instance method
      //  this(1);  // call to this must be first statement in constructor
        System.out.println("No-arg constructor ended");
    }

    public A(int a) {
        this(1,2);
        System.out.println("1-arg constructor started");
        System.out.println("1-arg constructor ended");
    }


    public A(int a, int  b) {
        System.out.println("2-arg constructor started");
        System.out.println("2-arg constructor ended");
    }
}
