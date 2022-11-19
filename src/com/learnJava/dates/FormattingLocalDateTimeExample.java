package com.learnJava.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {

    public static void parseLocalDateTime(){
        String dateTime = "2018-04-18T14:33:33";

        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("localDateTime1 = " + localDateTime1);

        /**
         * custom format
         */

        String dateTime1 = "2018-04-18T14|33|33";
        DateTimeFormatter datetimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime1, datetimeFormatter);
        System.out.println("localDateTime2 = " + localDateTime2);

        String dateTime2 = "2018-04-18abc14|33|33";
        DateTimeFormatter datetimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime3 = LocalDateTime.parse(dateTime2, datetimeFormatter1);
        System.out.println("localDateTime3 = " + localDateTime3);
    }

    public static void formatLocalDateTime(){
        DateTimeFormatter datetimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String convertedDateTime = localDateTime.format(datetimeFormatter);
        System.out.println("convertedDateTime = " + convertedDateTime);
    }

    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
