package com.junebatch.corejava.classelements.constructor.basic.overloading;

public class Runner {


    public static void main(String[] args) {
          new MyMath();     //no-args
          new MyMath(2);  //1-arg
          new MyMath(3,4);  //2 args
          new MyMath(3,4.4f);  //2 args-float
    }

}
