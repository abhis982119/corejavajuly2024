package com.junebatch.corejava.wrapperclasses;

import java.util.Arrays;
import java.util.List;

public class Basic {


    public static void main(String[] args) {

        int amount = 100;  // stack memory
        display(amount);  //AutoBoxing




       Float invoice_amount = Float.valueOf("10.8");
       displayInvoice(invoice_amount); // Auto-Unboxing


    }

    public static void displayInvoice(float amount){
        System.out.println(amount);
    }

    public static  void display(Integer amount){ // heap
        System.out.println(amount);
    }
}

