package com.laziz.chapter4.part9;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodManipulation {
    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        var period = Period.ofMonths(1); // create a period
        performAnimalEnrichment(start, end, period);

        var annually = Period.ofYears(1); // every 1 year
        Period quarterly = Period.ofMonths(3); // every 3 months
        var everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        Period everyOtherDay = Period.ofDays(2); // every 2 days
        var everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days


        var wrong = Period.ofYears(1).ofWeeks(1); // every week

        System.out.println(Period.of(1,2,3)); // prints P1Y2M3D
        System.out.println(Period.ofMonths(3)); // P3M
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        var upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }
}

