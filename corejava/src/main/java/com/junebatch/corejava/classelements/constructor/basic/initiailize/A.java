package com.junebatch.corejava.classelements.constructor.basic.initiailize;

public class A {



//Constructors are used to initialize the instance variable.
    private String instanceVariable;

    private static String staticVariable;

    public A(String instanceVariable) {
        System.out.println("A(string)-constructor");
        this.instanceVariable = instanceVariable;
        staticVariable = "static_variable_value"; // it is not recommended to initialize static variable from constructor
    }

    public A() { // default constructor will be created by jvm only if there is no constructor available.
        System.out.println("A-contructor");
    }
}
