package com.learnJava.mathodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperLambda = (s) -> s.toUpperCase();
    static Function<String, String> toUpperMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperLambda.apply("java8"));
        System.out.println(toUpperMethodReference.apply("java8"));
    }
}
