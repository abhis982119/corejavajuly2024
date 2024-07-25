package com.junebatch.corejava.garbagecollection;

public class A extends Object{

    private int empId = 101;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("A-finalize() executed ");

        int a = 10/0;
        System.out.println("Line after exception");
    }



}
