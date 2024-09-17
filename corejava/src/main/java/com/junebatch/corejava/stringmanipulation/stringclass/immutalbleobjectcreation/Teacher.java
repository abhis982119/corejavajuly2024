package com.junebatch.corejava.stringmanipulation.stringclass.immutalbleobjectcreation;

import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class Teacher {

    private String name;

    @SneakyThrows
    public Teacher getClone() {
       return (Teacher)clone();
    }

}
