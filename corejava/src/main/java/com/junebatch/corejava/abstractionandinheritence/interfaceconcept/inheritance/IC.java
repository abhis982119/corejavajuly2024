package com.junebatch.corejava.abstractionandinheritence.interfaceconcept.inheritance;

public interface IC extends IA,IB{


    default void m3(){
        System.out.println("IA-m3()");
    }

    //interface  IC inherits unrelated defaults for m3() from types  IA and  IB

}
