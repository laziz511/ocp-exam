package com.laziz.chapter4.part9;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Duration does not have a factory method that takes multiple units like Period does.
 */
public class DurationManipulation {
    public static void main(String[] args) {
        var daily = Duration.ofDays(1);                 // PT24H
        var hourly = Duration.ofHours(1);               // PT1H
        var everyMinute = Duration.ofMinutes(1);        // PT1M
        var everyTenSeconds = Duration.ofSeconds(10);   // PT10S
        var everyMilli = Duration.ofMillis(1);          // PT0.001S
        var everyNano = Duration.ofNanos(1);            // PT0.000000001S
    }

    private void usingChronoUnit() {
        var daily = Duration.of(1, ChronoUnit.DAYS);
        var hourly = Duration.of(1, ChronoUnit.HOURS);
        var everyMinute = Duration.of(1, ChronoUnit.MINUTES);
        var everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
        var everyMilli = Duration.of(1, ChronoUnit.MILLIS);
        var everyNano = Duration.of(1, ChronoUnit.NANOS);
    }

}

