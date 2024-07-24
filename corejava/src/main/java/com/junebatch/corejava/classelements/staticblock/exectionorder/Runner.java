package com.junebatch.corejava.classelements.staticblock.exectionorder;

public class Runner {


    public static void main(String[] args) {
        A a = new A();
        a.m1();

        System.out.println("------b creation --------");
        A b = new A();

    }
}
