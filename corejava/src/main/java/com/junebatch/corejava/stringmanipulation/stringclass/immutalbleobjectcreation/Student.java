package com.junebatch.corejava.stringmanipulation.stringclass.immutalbleobjectcreation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.poi.ss.formula.functions.T;

@ToString
@Getter
public final class Student extends Object {

    private final String name;

    private final int rollNumber;

    private final Teacher teacher;


    public Student(String name, int rollNumber, Teacher teacher) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.teacher = teacher;
    }

    public String getName(){
        return name;
    }

    public Teacher getTeacher(){
      return  new Teacher(teacher.getName());
    }
}
