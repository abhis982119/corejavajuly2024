package com.junebatch.corejava.stringmanipulation.stringclass.interview;

public class Equalvsoperator extends Object{


    public static void main(String[] args) {

        int a = 5;
        int c = 5;

        if (a == c) System.out.println("a == c"); // answer
        else System.out.println("a != c");

        String s1 = new String("nikhila");
        String s2 = new String("nikhila");
        String s3 = "nikhila";
        String s4 = new String("rohan");
        String s5 = "nikhila";

        if (s1 == s2) System.out.println("s1 == s2");
         else System.out.println("s1 != s2");  // answer


        if (s1.equals(s2)) System.out.println("s1 == s2");//answer
        else System.out.println("s1 != s2");

        if (s1 == s4) System.out.println("s1 == s4");
        else System.out.println("s1 != s4 ");  //answer

        if (s1.equals(s4)) System.out.println("s1 == s4");
        else System.out.println("s1 != s4");  //answer

        if(s3 == s5) System.out.println("s1 == s5"); //answer
        else System.out.println("s1 != s5");

        if (s3.equals(s5)) System.out.println("s3 == s5"); //answer
        else System.out.println("s3 != s5");


        // StringBuffer section
        System.out.println(" ********* StringBuffer Section ************ ");

        String s6 = new String("Nikhila");
        StringBuffer s7 = new StringBuffer("Nikhila");
        StringBuffer s8 = new StringBuffer("Nikhila");


        if(s6.equals(s7)){
            System.out.println("s6.equals(s7)");
        }else{
            System.out.println("s6 not equals 7");    // answer
        }

        if(s7.equals(s6)){
            System.out.println("s7.equals(s6)");
        }else{
            System.out.println("s7 not equals s6"); // answer
        }

        if(s7.equals(s8)){
            System.out.println("s7.equals(s8)");
        }else{
            System.out.println("s7 not equals s8"); // answer
        }

 /*       if(s7 == s6){
            System.out.println("s7 == s6)");
        }else{
            System.out.println("s7  !=  s6");   //java: incomparable types: java.lang.StringBuffer and java.lang.String
        }
    */

    }
}
