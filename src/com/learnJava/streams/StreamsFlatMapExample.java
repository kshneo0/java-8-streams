package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {
    public static List<String> printStudentActives(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()   //Stream<Student>
                .map(Student::getActivities)    //Stream<List<String>>
                .flatMap(List::stream)  //Stream<String>
                .distinct()
                .sorted()
                .collect(toList());

        return studentActivities;
    }

    public static Long printStudentActivesCount(){
        Long numberOfActivities = StudentDataBase.getAllStudents().stream()   //Stream<Student>
                .map(Student::getActivities)    //Stream<List<String>>
                .flatMap(List::stream)  //Stream<String>
                .distinct() // Stream<String> -> with distinct function performed
                .count();

        return numberOfActivities;
    }

    public static void main(String[] args) {
        System.out.println("printStudentActives : " + printStudentActives());
        System.out.println("printStudentActivesCount : " + printStudentActivesCount());
    }
}
