package com.junebatch.corejava.abstractionandinheritence.interfaceconcept.inheritance;

public interface IA {

    void m1(); // public abstract: provided by compiler

    default void m3(){
        System.out.println("IA-m3()");
    }

}
