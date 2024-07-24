package com.junebatch.corejava.thissuper.thiskeyword.methods;

public class A {

    public void m1() {

    }

    public static void m4() {
        System.out.println("m4() starts ");
        // this.m1();  //non-static variable this cannot be referenced from a static context
    }
}
