package com.junebatch.corejava.thissuper.superkeyword.constructor;

public class B extends A{


    public B() {
        this(1);
        System.out.println("B()");
    }

    public B(int a) {
        super(2);
        System.out.println("B(int)");
    }

}
