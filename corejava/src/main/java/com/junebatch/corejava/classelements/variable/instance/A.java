package com.junebatch.corejava.classelements.variable.instance;

public class A {

    int a;    //instance-variable   // default-value : 0


    public void m1() {
        int a = 10;  //stack
        {
            int b = 20;
            System.out.println("value of a : " + a);
        }

    }

    public void m2(){
        System.out.println("value of a : " + a);
    }

}
