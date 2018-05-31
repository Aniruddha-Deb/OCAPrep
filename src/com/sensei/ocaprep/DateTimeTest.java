package com.sensei.ocaprep;

// four date and time classes in the syllabus
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

import java.time.Month;

// this is the old date and time API, implemented through calendar.
// import java.util.Calendar;

public class DateTimeTest {

	public static void main( String[] args ) {
		
		// various constructors of LocalDate, LocalTime and LocalDateTime
		LocalDate.now();
		LocalDate.of( 2018, 5, 31 );
		LocalDate.of( 2018, Month.MAY, 31 );
		LocalDate.ofEpochDay( 17682 ); 
		LocalDate.ofYearDay( 2018, 151 );
		
		LocalTime.now();
		LocalTime.of( 18, 30 );
		LocalTime.of( 18, 30, 5 );
		LocalTime.of( 18, 30, 5, 5 );
		LocalTime.ofSecondOfDay( 66605 );
		LocalTime.ofNanoOfDay( (long)66605e9 );
		
		LocalDateTime.of( LocalDate.now(), LocalTime.now() );
		// other constructors of LocalDateTime are just combinations of the 
		// LocalDate and LocalTime constructors
		
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
