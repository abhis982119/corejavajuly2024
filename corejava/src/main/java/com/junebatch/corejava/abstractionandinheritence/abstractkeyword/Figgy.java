package com.junebatch.corejava.abstractionandinheritence.abstractkeyword;

public abstract class Figgy {




    public void takeDataFromResturants(){
        System.out.println("Data taken from restuarants");
    }


    public void showDataToUsers(){
        System.out.println("Order taken from user");
    }


    public abstract void takePaymentFormUser() ;


    public void notifyDeliveryPartner(){
        System.out.println("   Delivery partner notified");
    }


    public void updateOrderStatus(){
        System.out.println("Not implemented");
    }


    public void takeDeliveryPartnerReview(){

    }

    public void takeRestuarantPartnerReview(){

    }
}
