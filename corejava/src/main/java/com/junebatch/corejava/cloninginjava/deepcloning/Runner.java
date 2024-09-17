package com.junebatch.corejava.cloninginjava.deepcloning;

public class Runner {


    public static void main(String[] args) {
        Student student = new Student("Nikhila", 1, new Teacher("Rahul"));
        System.out.println(student);

       // Student clonedStudent = student.clone();
          Student clonedStudent = student.deepCloning();
        clonedStudent.setName("Shamila");
        clonedStudent.setRollNumber(10);
        clonedStudent.getTeacher().setName("Null");
        System.out.println("clonedStudent : " + clonedStudent);

        System.out.println(student.getTeacher().getName());


    }
}
