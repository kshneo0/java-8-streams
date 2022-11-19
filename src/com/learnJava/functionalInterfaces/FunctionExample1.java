package com.learnJava.functionalInterfaces;

public class FunctionExample1 {
    public static String perfoemConcat(String str) {
        return FunctionExample.addSomeString.apply(str);
    }
    public static void main(String[] args) {
        String result = perfoemConcat("Hello");
        System.out.println("Result : " + result);
    }
}
