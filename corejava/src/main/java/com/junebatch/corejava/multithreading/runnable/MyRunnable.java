package com.junebatch.corejava.multithreading.runnable;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hi, I'm a " + Thread.currentThread().getName());
    }
}
