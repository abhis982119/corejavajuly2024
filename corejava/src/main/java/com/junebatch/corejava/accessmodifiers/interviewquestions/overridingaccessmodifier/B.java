package com.junebatch.corejava.accessmodifiers.interviewquestions.overridingaccessmodifier;

public class B extends A{

    @Override
    public void m1(){
        System.out.println("B-m1()");
    }


    @Override
  //  protected void m2(){      //  attempting to assign weaker access privileges; was public
    public void m2(){      //  attempting to assign weaker access privileges; was public
        System.out.println("B-m2()");
    }

}
