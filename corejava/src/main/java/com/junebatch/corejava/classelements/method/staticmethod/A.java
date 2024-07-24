package com.junebatch.corejava.classelements.method.staticmethod;

public class A {

    static String  className = "A.class";


    int age = -1;  //instance-variable



    public static void m1(){
        System.out.println("A-m1()-static");
        System.out.println("The value of className = " + className);
      //  System.out.println("The instance variable " + age); //java: non-static variable age cannot be referenced from a static context
    }
}
