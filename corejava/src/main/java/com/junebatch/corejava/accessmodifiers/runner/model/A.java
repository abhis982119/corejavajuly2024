package com.junebatch.corejava.accessmodifiers.runner.model;

public class A {


    public void publicMethod(){
        System.out.println("A-publicMethod()");
    }

    protected void protectedMethod(){
        System.out.println("A-proctectedMethod()");
    }

    void defaultMethod(){
        System.out.println("A-defaultMethod");
    }


    private void privateMethod(){
        System.out.println("A-privateMethod()");
    }
}
