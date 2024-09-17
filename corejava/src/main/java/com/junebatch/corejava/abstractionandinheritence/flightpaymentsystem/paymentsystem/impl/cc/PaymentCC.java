package com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem.paymentsystem.impl.cc;

import com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem.paymentsystem.api.IPayment;

public abstract  class PaymentCC implements IPayment {


    @Override
    public final void doPayment(double amount) {
        takeCCDetails();
        userRedirectionToGateWay();
        validateResponseValidation();
    }

    public void takeCCDetails(){
        System.out.println("CC details received successfully");
    }

    public abstract void userRedirectionToGateWay(); //razorpay, worldpay

    public abstract void validateResponseValidation();

}
