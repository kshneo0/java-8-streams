package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {

    public static List<String> nemesList (){
        List<String> studentList = StudentDataBase.getAllStudents().stream()//Stream<student>
                //Student as an input -> Student Name
                .map(Student::getName)  //Stream<String>
                .map(String::toUpperCase)   //Stream<String> -> uppercase operation on each input
                .collect(toList()); //Set<String>

        return studentList;
    }

    public static Set<String> nemesSet (){
        Set<String> studentList = StudentDataBase.getAllStudents().stream()//Stream<student>
                //Student as an input -> Student Name
                .map(Student::getName)  //Stream<String>
                .map(String::toUpperCase)   //Stream<String> -> uppercase operation on each input
                .collect(toSet()); //Set<String>

        return studentList;
    }

    public static void main(String[] args) {
        System.out.println( nemesList());
        System.out.println( nemesSet());
    }
}
