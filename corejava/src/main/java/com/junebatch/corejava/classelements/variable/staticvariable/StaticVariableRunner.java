package com.junebatch.corejava.classelements.variable.staticvariable;

public class StaticVariableRunner {

    public static void main(String[] args) {
        A a = new A();
        // a.m1();

        //Instance variable can be accessed by object reference
        System.out.println("instance variable using object reference " + a.instanceVaraible);

        //Static variable can be access with class name
        System.out.println("static variable using class name : " + A.staticVaraible );


        //static varible can be accessed with using object reference but not recommended.
        System.out.println("static variable access with object reference : " + a.staticVaraible);
    }
}
