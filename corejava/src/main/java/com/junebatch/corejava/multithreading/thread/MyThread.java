package com.junebatch.corejava.multithreading.thread;

public class MyThread extends Thread{


    @Override
    public void run() {
        System.out.println("Hi, I'm a " + Thread.currentThread().getName());
    }
}
