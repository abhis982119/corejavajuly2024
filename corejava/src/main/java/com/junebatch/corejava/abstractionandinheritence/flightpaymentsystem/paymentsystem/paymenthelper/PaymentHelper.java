package com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem.paymentsystem.paymenthelper;

import com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem.paymentsystem.api.IPayment;

public class PaymentHelper {

    public static boolean doPayment(IPayment payment, double amount){
        payment.doPayment(amount);
        return true;
    }
}
