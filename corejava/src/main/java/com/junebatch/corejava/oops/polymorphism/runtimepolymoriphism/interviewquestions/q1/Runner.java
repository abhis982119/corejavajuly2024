package com.junebatch.corejava.oops.polymorphism.runtimepolymoriphism.interviewquestions.q1;

public class Runner {

    public static void main(String[] args) {
        A a = new A();
        a.m1();    //A-m1()


        B b = new B();
        b.m1();    //A-m1()
        b.m2();    //B-m1();

        C c = new C();
        c.m1();   //A-m1()
        c.m2();   //B-m2()
        c.m3();   //B-m3();




        A ac = new C();  //Parent class reference variable can hold child class object in java , but not other way round
        ac.m1();   //C-m1()
/*        ac.m2();    // compiler time error
        ac.m3();   */

/*      C ca = new A();
        ca.m1();   //A-m1();
        ca.m2();
        ca.m3();
*/






    }
}
