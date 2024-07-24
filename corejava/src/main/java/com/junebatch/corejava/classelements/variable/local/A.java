package com.junebatch.corejava.classelements.variable.local;

public class A {



    public void m1(){
        int a = 10;
        {
            int b = 20; //declaration + initialization
            System.out.println("value of a is : " + a);
            System.out.println("value of b is : " + b);
        }
        System.out.println("value of a = " + a);
    }




}
