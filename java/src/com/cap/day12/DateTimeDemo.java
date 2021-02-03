package com.cap.day12;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime timePoint = LocalDateTime.now(); // The current date and time

		System.out.println(timePoint);

		LocalDate localDate = LocalDate.of(2012, Month.DECEMBER, 12); // from values

		System.out.println(localDate);

		LocalTime localTime = LocalTime.of(17, 18); // the train I took home today
		System.out.println(localTime);

		LocalTime localTime1 = LocalTime.parse("10:15:30"); // From a String
		System.out.println(localTime1);

		LocalDate theDate = timePoint.toLocalDate();
		Month month = timePoint.getMonth();
		int day = timePoint.getDayOfMonth();
		timePoint.getSecond();

		System.out.println(theDate + " Month: " + month + " Day : " + day + " seconds: " + timePoint.getSecond());

		// to print in a particular format
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatedDateTime = timePoint.format(format);

		System.out.println("in foramatted manner " + formatedDateTime);

		// Set the value, returning a new object
		LocalDateTime thePast = timePoint.withDayOfMonth(10).withYear(2010);

		System.out.println(thePast);

		/*
		 * You can use direct manipulation methods, or pass a value and field pair
		 */
		LocalDateTime yetAnother = thePast.plusWeeks(3).plus(3, ChronoUnit.MONTHS);
		System.out.println(yetAnother);

		// adding 1 week to the current date
		LocalDateTime nextWeek = timePoint.minus(1, ChronoUnit.WEEKS);
		System.out.println("Previous Week: " + nextWeek);

		// Temporals

		// to get the first day of next month
		LocalDateTime dayOfNextMonth = timePoint.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("Temporal " + dayOfNextMonth);

//		/ You can specify the zone id when creating a zoned date time
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		ZonedDateTime zoned = ZonedDateTime.of(timePoint, tokyo);
		System.out.println(zoned.getHour());

		// to get the current zone
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("the current zone is " + currentZone.getZone());
		ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
		System.out.println("tokyo time zone is " + tokyoZone);

		// PEriod: It deals with date based amount of time.
//	    Duration : It deals with time based amount of time.
		LocalDate date1 = LocalDate.now();

		LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);

		Period gap = Period.between(date2, date1);
		System.out.println("gap between dates " + "is a period of " + gap);

		LocalTime time1 = LocalTime.now();
		System.out.println("the current time is " + time1);

		Duration fiveHours = Duration.ofHours(5);

		// adding five hours to the current
		// time and storing it in time2
		LocalTime time2 = time1.plus(fiveHours);

		System.out.println("after adding five hours " + "of duration " + time2);

		Duration gapd = Duration.between(time2, time1);
		System.out.println("duraion gap between time1" + " & time2 is " + gapd);

		// Instant

		Instant instant = Instant.now();
		System.out.println(instant);
	}
}
