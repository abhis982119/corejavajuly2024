package com.junebatch.corejava.classelements.method.nestedcalls;

public class A {

    public void m1(){
        System.out.println("A-m1() method starts");
        m2();
        System.out.println("A-m1() method ends");
    }


    public void m2(){
        System.out.println("A-m2() method starts");
        m3();
        System.out.println("A-m2() method ends");
    }


    public void m3(){
        System.out.println("A-m3() method starts");
        System.out.println("A-m3() method ends");
    }




}
