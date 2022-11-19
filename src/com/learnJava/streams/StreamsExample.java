package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        //student name and there activities in a map
        Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(student -> {
                    System.out.println("0---\n" + student);
                })
                .filter(studentPredicate)   // Stream<Student>
                .peek(student -> {
                    System.out.println("after 1 st filter:\n" + student);
                })
                .filter(studentGpaPredicate)   // Stream<Student>
                .peek(student -> {
                    System.out.println("after 2 nd filter:\n" + student);
                })
                .collect(Collectors.toMap(Student::getName, Student::getActivities)); // Map

        System.out.println(studentMap);
    }
}
