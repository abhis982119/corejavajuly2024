package com.junebatch.corejava.abstractionandinheritence.interfaceconcept.inheritance;

public interface IB   {

    void m2();

    default void m3(){
        System.out.println("IB-m3()");
    }
}
