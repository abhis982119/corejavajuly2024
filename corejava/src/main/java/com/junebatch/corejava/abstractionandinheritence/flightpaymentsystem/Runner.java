package com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem;

import com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem.paymentsystem.impl.cc.bca.BCACC;
import com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem.paymentsystem.impl.cc.worldpaycc.WorldPayCC;
import com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem.paymentsystem.paymenthelper.PaymentHelper;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Selected flight");
        System.out.println("Selected time slot");
        double amount = 98.76;

        WorldPayCC paymentStategy = new WorldPayCC();
         //  BCACC paymentStategy = new BCACC();


        boolean isPaymentSuccessful = PaymentHelper.doPayment(paymentStategy, amount);
        System.out.println(" Flight " + (isPaymentSuccessful ? " successfully booked " : " booking payment failed"));


        /*
        ParentClass pr = new ChildClass();
         */
    }
}
