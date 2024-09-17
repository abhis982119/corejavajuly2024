package com.junebatch.corejava.cloninginjava.deepcloning;

import lombok.*;
import org.apache.poi.ss.formula.functions.T;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student implements Cloneable{

                            //   Shallow cloning              Deep cloning
    private String name;  //       new                          new

    private int rollNumber; //      new                         new

    private Teacher teacher;//      same                         new



    @Override
    @SneakyThrows
    public Student clone(){
        return (Student) super.clone();
    }


    public Student deepCloning(){
         return new Student(name, rollNumber, new Teacher(teacher.getName()));

    }




}
