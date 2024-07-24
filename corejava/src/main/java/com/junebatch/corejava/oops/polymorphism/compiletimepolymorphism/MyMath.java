package com.junebatch.corejava.oops.polymorphism.compiletimepolymorphism;

public class MyMath {

    public int square(byte a) {
        System.out.println("square(byte" +
                ") called");
        return a + a;
    }


    public int square(short a) {
        System.out.println("square(short) called");
        return a + a;
    }


    public int square(int a) {
        System.out.println("square(int) called");
        return a * a;
    }


    public long square(long a) {
        System.out.println("square(long) called");
        return a * a;
    }



    public float square(float a) {
        System.out.println("square(float) called");
        return a * a;
    }


    public double square(double a) {
        System.out.println("square(double) called");
        return a * a;
    }







}

