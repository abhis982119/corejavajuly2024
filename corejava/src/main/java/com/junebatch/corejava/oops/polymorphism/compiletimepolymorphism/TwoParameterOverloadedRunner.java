package com.junebatch.corejava.oops.polymorphism.compiletimepolymorphism;

public class TwoParameterOverloadedRunner {

    //typecast : (byte)10;
    public static void main(String[] args) {

        MyTMath myMath = new MyTMath();
/*
        myMath.add(10,10); //int
        myMath.add((byte)10,(byte)10); //byte
        myMath.add((short)10,(short)10); //short
        myMath.add(10l,10l); //long

*/


 /*       myMath.add(10, (byte)10);  // int
        myMath.add((byte)10, 10); // int

        myMath.add(10,(short)10); //int

        myMath.add(10,10l); //long
*/


/*        myMath.add(10, 10.5);     //double
        myMath.add(10l, 10.5f);   //float
        myMath.add(10.5, (short)10.5);  //double*/



        myMath.add(10,10); //float-float
        myMath.add(10.0,10); // double-float
        myMath.add(10.0,10); // double-float

        myMath.add(10,10f); //int-float
    //    myMath.add(10,10l); //int-float   //  java: reference to add is ambiguous

     //   both method add(long,long) in com.junebatch.corejava.oops.polymorphism.compiletimepolymorphism.MyTMath and method add(int,float) in com.junebatch.corejava.oops.polymorphism.compiletimepolymorphism.MyTMath match




    }


}
