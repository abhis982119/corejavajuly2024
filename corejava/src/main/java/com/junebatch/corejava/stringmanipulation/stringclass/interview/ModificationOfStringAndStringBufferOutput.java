package com.junebatch.corejava.stringmanipulation.stringclass.interview;

public class ModificationOfStringAndStringBufferOutput {


    public static void main(String[] args) {
        String name1  = new String("Ram");
        name1 =  name1.concat(" Sita");

        StringBuffer name2 = new StringBuffer("Ram");
        name2.append(" Sita");


        System.out.println("String value : " +  name1); //   Ram
        System.out.println("StringBuffer value : " + name2); // Ram Sita

    }
}
