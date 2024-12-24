package com.laziz.chapter4.part9;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

/**
 * Period is used when Date is available, such as LocalDate, LocalDateTime, ZonedDateTime
 * Duration is used when Time is available, such as LocalDateTime, LocalTime, ZonedDateTime
 */
public class PeriodVsDuration {
    public static void main(String[] args) {
        var date = LocalDate.of(2022, 5, 25);
        var period = Period.ofDays(1);
        var duration = Duration.ofDays(1);
        System.out.println(date.plus(period));  // 2022–05–26
        System.out.println(date.plus(duration));    // Unsupported unit: Seconds

        String aaa = "222";
        String intern = aaa.intern();
        System.out.println(intern);

    }
}

