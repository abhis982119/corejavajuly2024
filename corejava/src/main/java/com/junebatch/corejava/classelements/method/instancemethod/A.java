package com.junebatch.corejava.classelements.method.instancemethod;

public class A {

    int instance_variable = 10; //instance-variable

    public static int static_variable = 10; //static-variable

     public void m1  () { //instance-method
        System.out.println("Instance variable value : " + instance_variable);
        System.out.println("Static variable value : " + static_variable);
    }


    public void m2(){
        System.out.println("A-m1()");
    }

}
