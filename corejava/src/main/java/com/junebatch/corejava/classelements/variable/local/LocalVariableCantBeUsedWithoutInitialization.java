package com.junebatch.corejava.classelements.variable.local;

public class LocalVariableCantBeUsedWithoutInitialization {

    public static void main(String[] args) {
        int a;
        // System.out.println("value of a : " + a); //error java: variable a might not have been initialized
    }
}
