package com.learnJava.parallestream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActives(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()   //Stream<Student>
                .map(Student::getActivities)    //Stream<List<String>>
                .flatMap(List::stream)  //Stream<String>
                .distinct()
                .sorted()
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential : " + (endTime - startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActives(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()   //Stream<Student>
                .parallel()
                .map(Student::getActivities)    //Stream<List<String>>
                .flatMap(List::stream)  //Stream<String>
                .distinct()
                .sorted()
                .collect(toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel : " + (endTime - startTime));

        return studentActivities;
    }

    public static void main(String[] args) {
        sequentialPrintStudentActives();
        parallelPrintStudentActives();
    }
}
