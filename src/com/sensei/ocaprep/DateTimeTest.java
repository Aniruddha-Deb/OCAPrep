package com.sensei.ocaprep;

// four date and time classes in the syllabus
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalField;
import java.time.Period;

// this is the old date and time API, implemented through calendar.
// import java.util.Calendar;

public class DateTimeTest {

	public static void main( String[] args ) {
		
		// has to be ISO. a DateTimeParseException is thrown otherwise.
		LocalDate date = LocalDate.parse( "2018-05-26" );
		
		System.out.println( date.getYear() );
		System.out.println( date.getMonthValue() );
		System.out.println( date.getDayOfMonth() );
		System.out.println();
		System.out.println( date.toEpochDay() );
		System.out.println();
		System.out.println( date.isAfter( LocalDate.parse( "2018-05-21" ) ) );
		System.out.println( date.isBefore( LocalDate.parse( "2018-05-30" ) ) );
		
	}
}
