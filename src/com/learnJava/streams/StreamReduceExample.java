package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                // 1
                // 3
                // 5
                // 7
                // a=1, b=1,(from stream) => result 1 is returned
                // a=1, b=3,(from stream) => result 3 is returned
                // a=3, b=5,(from stream) => result 15 is returned
                // a=15, b=7,(from stream) => result 105
                .reduce(1, (a,b)  -> a * b);

    }
    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce( (a,b)  -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent(){
//        return StudentDataBase.getAllStudents().stream()
//                .reduce((s1, s2) -> {
//                    if(s1.getGpa()> s2.getGpa()){
//                        return s1;
//                    } else {
//                        return s2;
//                    }
//                });

        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.getGpa()> s2.getGpa() ? s1 : s2);


    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integers));
        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);

        System.out.println(result.isPresent());
        System.out.println(result.get());

        List<Integer> integers1 = new ArrayList<>();
        Optional<Integer> result1 = performMultiplicationWithoutIdentity(integers1);

        System.out.println(result1.isPresent());
        if(result1.isPresent()){
            System.out.println(result1.get());
        }

        Optional<Student> studentOptional = getHighestGPAStudent();
        if(studentOptional.isPresent()){
            System.out.println(studentOptional.get());

        }

    }
}
