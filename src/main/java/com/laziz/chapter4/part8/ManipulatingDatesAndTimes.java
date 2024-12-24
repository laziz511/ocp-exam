package com.laziz.chapter4.part8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * The date and time classes are immutable.
 * Remember to assign the results of these methods to a reference variable, so they are not lost.
 * Also, you can chain the methods of date and time
 */
public class ManipulatingDatesAndTimes {
    public static void main(String[] args) {
        var date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date);       // 2022–01–20
        date = date.plusDays(2);
        System.out.println(date);       // 2022–01–22
        date = date.plusWeeks(1);
        System.out.println(date);       // 2022–01–29
        date = date.plusMonths(1);
        System.out.println(date);       // 2022–02–28
        date = date.plusYears(5);
        System.out.println(date);       // 2027–02–28


        var date1 = LocalDate.of(2024, Month.JANUARY, 20);
        var time1 = LocalTime.of(5, 15);

        var dateTime = LocalDateTime.of(date1, time1)
                .minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dateTime);
    }

    private void trickMethod() {
        var date = LocalDate.of(2024, Month.JANUARY, 20);
        date = date.plusMinutes(1); // DOES NOT COMPILE
        // LocalDate does not contain time. This means that you cannot add minutes to it.
    }
}

