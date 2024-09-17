package com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem.paymentsystem.impl.cc.worldpaycc;

import com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem.paymentsystem.impl.cc.PaymentCC;

public class WorldPayCC extends PaymentCC {


    @Override
    public void userRedirectionToGateWay() {
        System.out.println("Redirection successful to worldpay gateway");
    }

    @Override
    public void validateResponseValidation() {
        System.out.println("received successful response from worldpay");
    }
}
