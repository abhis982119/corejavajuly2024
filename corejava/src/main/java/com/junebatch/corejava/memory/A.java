package com.junebatch.corejava.memory;

public class A {

    public int c ;

    public void m1(){
        int a  = 10;
        m2();
        System.out.println("A-m1()");
    }

    public void m2(){
        int b = 20;
        System.out.println("A-m2()");
    }

    /*

----------        -------          --------                 ---------
main                m1()             m2()                     Heap
----------        --------         ---------                ----------
A a : 987678      a = 10            b = 20                      987678
                                                            A{ int c = 0}
----------       -------           --------
                 Runner:main()              m1():9
                   :6
---------        -------           ---------

  */



}
