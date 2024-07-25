package com.junebatch.corejava.garbagecollection;

import lombok.SneakyThrows;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {

        A a = new A();
        a = null;

        System.gc(); //request the gc to start collecting garbage


        Thread.sleep(4000);
    }
}
