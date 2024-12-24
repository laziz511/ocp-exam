package com.laziz.chapter4.part9;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * - The Instant class represents a specific moment in time in the GMT time zone
 * - You cannot convert a LocalDateTime to an Instant. Remember that an Instant is a point in time.
 *      A LocalDateTime does not contain a time zone, and it is therefore not universally recognized
 *      around the world as the same moment in time.
 */
public class InstantsManipulation {
    public static void main(String[] args) {
        var date = LocalDate.of(2022, 5, 25);
        var time = LocalTime.of(11, 55, 00);
        var zone = ZoneId.of("US/Eastern");

        var zonedDateTime = ZonedDateTime.of(date, time, zone);
        var instant = zonedDateTime.toInstant(); // 2022–05–25T15:55:00Z

        System.out.println(zonedDateTime); // 2022–05–25T11:55–04:00[US/Eastern]
        System.out.println(instant); // 202–05–25T15:55:00Z
    }
}
