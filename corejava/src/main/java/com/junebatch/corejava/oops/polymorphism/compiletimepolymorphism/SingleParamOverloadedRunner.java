package com.junebatch.corejava.oops.polymorphism.compiletimepolymorphism;


public class SingleParamOverloadedRunner {


    public static void main(String[] args) {
        MyMath math = new MyMath();

        //    math.square((byte)10);
        //     math.square((short)10);
        //      math.square(10);  // call integer as default-int type is int

        byte b = 10;
        //    math.square(b);


     //   math.square(2157000000L); //call long



        math.square(10.5);  // double
        math.square(10.5f);  // float
        math.square((float)10.5);  // float





    }
}
