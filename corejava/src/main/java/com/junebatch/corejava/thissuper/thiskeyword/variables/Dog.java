package com.junebatch.corejava.thissuper.thiskeyword.variables;


public class Dog  extends  Object{

    private String name;

    public Dog(String name) {
        this.name = name; // to initialize the instance-variable from local variable of same name
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
