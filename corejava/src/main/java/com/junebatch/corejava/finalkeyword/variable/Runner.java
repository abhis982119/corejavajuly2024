package com.junebatch.corejava.finalkeyword.variable;

public class Runner {

    public static void main(String[] args) {
        A a = new A();
     //   a.companyName = "Foogle";  //cannot assign a value to final variable companyName
        System.out.println(a.getCompanyName());;
    }
}
