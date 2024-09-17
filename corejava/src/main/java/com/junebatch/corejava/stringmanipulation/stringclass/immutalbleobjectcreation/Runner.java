package com.junebatch.corejava.stringmanipulation.stringclass.immutalbleobjectcreation;

public class Runner {


    public static void main(String[] args) {
        Student student = new Student("Nikhila", 1, new Teacher("Rahul"));
        System.out.println(student);


        System.out.println("Result of getname : " + student.getName());
        student.getTeacher().setName("NULL");
        System.out.println(student);




    }
}
