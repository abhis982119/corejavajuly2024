package com.junebatch.corejava.classelements.instanceblock.initialization;

public class A {
   //instance-block : It is used to initialize instance variable in hardcoded way
    {
        name = "instance_block_tempName";
    }

    private String name ;

    public void printName(){
        System.out.println("name : " + name);
    }


}
