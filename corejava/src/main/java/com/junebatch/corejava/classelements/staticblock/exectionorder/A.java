package com.junebatch.corejava.classelements.staticblock.exectionorder;

public class A {

    static{//static-block
        System.out.println("static-A{} -static-block called");  // 1
    }

    { //instance-block
        System.out.println("A{}-instance-block called");   //2
    }

    private static int age; //4byte
    public String instanceVariable; //instance-variable

    public A() { //constructor
        instanceVariable = "dynamic_value";
        System.out.println("A()-constructor called");  //3
    }

    public void m1(){ //instance-method
        System.out.println("A-Instance-variable : " + instanceVariable);
    }

}
