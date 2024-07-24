package com.junebatch.corejava.classelements.staticblock.variableinitialization;

public class A {

    //static-block : It is used to initialize static-variables in hardcoded way
   static {
        name = "static_block_temp_name";
    }

    private static String name;


    public static void printName(){
        System.out.println("name : " + name);
    }
}
