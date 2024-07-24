package com.junebatch.corejava.thissuper.superkeyword.method;

public class B extends A{

    public void m1(){
        int a = 10;  //4 byte
        System.out.println("B-m1()");
        super.m1(); //call the parent method using super
    }
}
