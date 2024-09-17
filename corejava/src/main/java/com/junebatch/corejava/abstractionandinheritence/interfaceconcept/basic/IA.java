package com.junebatch.corejava.abstractionandinheritence.interfaceconcept.basic;

public interface IA {


   public static final  String companyName = "Google"; // public static final will be added by compiler if not written

    public abstract void m1(); // public abstract will be provided by compiler if not written

    public static void staticMethod(){
        System.out.println("IA-staticMethod");
    }

    default void defaultMethod(){
        System.out.println("IA-defaultMethod");
    }


    private void privateMethod(){
        System.out.println("IA-privateMethod");
    }






}
