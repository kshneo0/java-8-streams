package com.learnJava.nemericstreams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,5)
                .mapToObj(i -> { return new Integer(i);})
                .collect(toList());
    }

    public static long mapToLong() {
        return IntStream.rangeClosed(1,5)  //intStream
                // i is passed from the intStream
                .mapToLong(i -> i)// convert intStream to longStream
                .sum();
    }

    public static double mapToDouble() {
        return IntStream.rangeClosed(1,5)  //intStream
                // i is passed from the intStream
                .mapToDouble(i -> i)// convert intStream to doubleStream
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("mapToObj : " + mapToObj());

        System.out.println("mapToLong : " + mapToLong());

        System.out.println("mapToLong : " + mapToDouble());
    }
}
