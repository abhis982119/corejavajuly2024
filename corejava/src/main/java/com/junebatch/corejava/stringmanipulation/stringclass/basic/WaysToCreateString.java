package com.junebatch.corejava.stringmanipulation.stringclass.basic;

public class WaysToCreateString {

    public static void main(String[] args) {
        String str="ratan";
        System.out.println(str);
        String str1=new String("ratan");
        System.out.println(str1);
        char[] ch={'r','a','t','a','n'};
        String str3=new String(ch);
        System.out.println(str3);
        char[] ch1={'a','r','a','t','a','n','a'};
        String str4=new String(ch1,1,5);
        System.out.println(str4);
        byte[] b={65,66,67,68,69,70};
        String str5=new String(b);
        System.out.println(str5);
        byte[] b1={65,66,67,68,69,70};
        String str6=new String(b1,2,4);
        System.out.println(str6);

        byte[] b3={97,98,99,100};
        String str7=new String(b3);
        System.out.println(str7);
    }
}
