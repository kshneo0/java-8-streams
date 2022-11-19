package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {
    public static void main(String[] args) {

        List<String> nameList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));

        System.out.println("nameList : " + nameList);


        Set<String> nameSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet()));

        System.out.println("nameSet : " + nameSet);
/*
        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());
*/

    }
}
