package com.junebatch.corejava.classelements.constructor.basic.dymanicintialization;

public class Dog {

    private String breed;

    private String color;

    private String name;

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
