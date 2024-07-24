package com.junebatch.corejava.classelements.variable.local;

public class LocalVariableWithoutInitializationButWithNoUse {

    public static void main(String[] args) {
        int a ;     // 4 byte
        int b = 20;  // 4 byte

        System.out.println(b);
    }
}
