package com.learnJava.constructorReference;

import com.learnJava.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;
    static Function<String, Student> studentFundtion = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentFundtion.apply("ABC"));
    }
}
