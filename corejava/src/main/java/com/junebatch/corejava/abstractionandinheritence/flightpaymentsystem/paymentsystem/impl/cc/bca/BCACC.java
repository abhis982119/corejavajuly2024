package com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem.paymentsystem.impl.cc.bca;

import com.junebatch.corejava.abstractionandinheritence.flightpaymentsystem.paymentsystem.impl.cc.PaymentCC;

public class BCACC  extends PaymentCC {

    @Override
    public void userRedirectionToGateWay() {
        System.out.println("Redirected to BCA gateway");
    }

    @Override
    public void validateResponseValidation() {
        System.out.println("successfully received payment by BCA gateway");
    }
}
