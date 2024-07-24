package com.junebatch.corejava.oops.polymorphism.compiletimepolymorphism;

public class MyTMath {

    public int add(byte a, byte b) {
        System.out.println("MyTMath-add(byte) called ");
        return a + b;
    }

    public int add(short a, short b) {
        System.out.println("MyTMath-add(short) called ");
        return a + b;
    }

    public int add(int a, int b) {
        System.out.println("MyTMath-add(int) called ");
        return a + b;
    }

    public long add(long a, long b) {
        System.out.println("MyTMath-add(long) called ");
        return a + b;
    }


    public float add(float a, float b) {
        System.out.println("MyTMath-add(float) called ");
        return a + b;
    }


    public double add(double a, double b) {
        System.out.println("MyTMath-add(double) called ");
        return a + b;
    }





    public float add (int a, float b){
        System.out.println("MyTMath-add(int,float) called ");
        return a+b;
    }


    public double add(double a, float b){
        System.out.println("MyTMath-add(double,float) called ");
        return a+b;
    }


}
