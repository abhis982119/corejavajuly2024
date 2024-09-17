package com.junebatch.corejava.stringmanipulation.stringclass.interview;

public class NumberOfObjects {


    public static void main(String[] args) {

        String a = new String("a");  //1  // 1
        String b = new String("b");  //1  // 2

        String c = "c";  //1  // 3
        String d = "d";  //1 // 4

        String ab = new String("abc");  //1 //5
        String bc = new String("be");   //1 //6
        String db = new String("b");   //1 //7



        String e = "c";        // 0 //7
        a.concat(b);         //1 //8
        ab.substring(1);  //1 //9

        bc.replace(e,c);  //1 //10
    }
}
/*

String a = "ratan"      [ ratan ]
a.concat(" sharma");    [ ratan sharma ]
 */


/*
   String url = "";  // 1  // 1 // ""
   url += "https://"  // 1 // 2 // "https
   url += "wwww.youtube.com"  // 3 // 3 // "https://wwww.youtube.com
   url += "/feed/history   // 1 // 4 // https://wwww.youtube.com/feed/history




 */