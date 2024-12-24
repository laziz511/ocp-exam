package com.laziz.chapter4.part9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/**
 * Period of for day is longer time. There is also Duration, which is intended for smaller units of time.
 *       For Duration, you can specify the number of days, hours, minutes, seconds, or nanoseconds.
 *       Duration works roughly the same way as Period, except it is used with objects that have time.
 *       A Duration is stored in hours, minutes, and seconds
 */
public class PeriodUsage {
    public static void main(String[] args) {
        var date = LocalDate.of(2022, 1, 20);
        var time = LocalTime.of(6, 15);
        var dateTime = LocalDateTime.of(date, time);
        var period = Period.ofMonths(1);
        System.out.println(date.plus(period)); // 2022–02–20
        System.out.println(time.plus(period)); // Exception
        System.out.println(dateTime.plus(period)); // 2022–02–20T06:15
    }
}

