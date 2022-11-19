package com.learnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value = 4;  // static variable

    public static void main(String[] args) {

//        int value = 4;  // local variable

        Consumer<Integer> c1 = (i) -> {
            value++;  //지역 변수는 수정할 수 없지만, 정적 변수는 수정할 수 있다.
            System.out.println(value + i);
        };

//        value = 6;  //lambda expression에서 사용할 대는 final로 사용되었기 때문에 수정할 수 없다.

        c1.accept(4);

    }
}
