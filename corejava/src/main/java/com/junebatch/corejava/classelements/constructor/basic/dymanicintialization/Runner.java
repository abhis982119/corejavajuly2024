package com.junebatch.corejava.classelements.constructor.basic.dymanicintialization;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
/*
        Dog leo = new Dog("Husky", "Leo");
        Dog goldy = new Dog("Labrador","Goldy");


        System.out.println(leo);
        System.out.println(goldy);
*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter breed ");
        String breed = sc.next();

        System.out.println("Please enter dog color ");
        String color = sc.next();

        Dog dog = new Dog(breed, color);
        System.out.println(dog);

    }
}
