package com.junebatch.corejava.classelements.constructor.basic.overloading;

public class MyMath {

    public MyMath() {
        System.out.println("No-args-constructor");
    }

    public MyMath(int a){
        System.out.println("1-arg constructor");
    }

    public MyMath(int a, int b){
        System.out.println("2-arg int-int constructor");
    }

    public MyMath(int a, float b){
        System.out.println("2-arg int-float constructor");
    }

}
