package com.junebatch.corejava.classelements.variable.staticvariable;

public class A {

     int  instanceVaraible = 10;  // instance-variable //default-value : 0   // heap-memory

    static int staticVaraible  = 20;  // instance-variable //default-value : 0  // non-heap memory

    public void m1(){
        int localVariable = 1;
        System.out.println("localVariable : " + localVariable);
        System.out.println(" instanceVariable : " + instanceVaraible);
        System.out.println("staticVariable : " + staticVaraible);
    }

}
