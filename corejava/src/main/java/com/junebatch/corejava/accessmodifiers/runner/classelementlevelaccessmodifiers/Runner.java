package com.junebatch.corejava.accessmodifiers.runner.classelementlevelaccessmodifiers;

import com.junebatch.corejava.accessmodifiers.runner.model.A;

public class Runner extends A {


    public static void main(String[] args) {
        A a = new A();
        a.publicMethod(); //access is public
     // a.protectedMethod(); // proctected elements act as a private entity, hence not visible through a reference variable
     // a.defaultMethod();   // defaultMethod() is not public, cannot be accessed from outside package
     //   a.privateMethod();   // privateMethod() has private access
    }

    public void m1(){
        protectedMethod(); // proctected element direct access inside the class
    }



}
