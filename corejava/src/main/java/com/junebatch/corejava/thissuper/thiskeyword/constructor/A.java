package com.junebatch.corejava.thissuper.thiskeyword.constructor;

public class A {

    public A() {
        this(1); // this() keyword for constructor calling should be first line in a constructor
        System.out.println("A() constructor");
    }

    public A(int a) {
        this(2,3);
        System.out.println("A(int) constructor");
    }


    public A(int a , int b) {
        System.out.println("A(int,int) constructor");
    }

}
