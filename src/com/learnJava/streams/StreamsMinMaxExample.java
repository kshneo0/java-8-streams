package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                    .reduce(0, (x,y) -> x>y ? x : y);
    }

    public static Optional<Integer> findMinValue(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y) -> x<y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce( (x,y) -> x>y ? x : y);
    }


    public static void main(String[] args) {
//        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        List<Integer> integerList = new ArrayList<>();

        Optional<Integer> minValue = findMinValue(integerList);
        if(minValue.isPresent()) {
            System.out.println(" max value is : " + minValue.get());
        } else {
            System.out.println("No Input is passed");
        }

/*
        int maxValue = findMaxValue(integerList);
        System.out.println(" max value is : " + maxValue);

        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
        System.out.println("Optional Max is : "+ maxValueOptional);
        if(maxValueOptional.isPresent()){
            System.out.println("MaxValue using optional : " + maxValueOptional.get());
        } else{
            System.out.println("No max value fount.");
        }
*/

    }
}
