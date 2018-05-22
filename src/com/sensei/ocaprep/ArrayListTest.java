package com.sensei.ocaprep;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest {
	
    public static void main( String args[] ) {

    	// Iterator practice
    	ArrayList<String> strList = new ArrayList<>();
    	strList.add( "One" );
    	strList.add( "Two" );
    	strList.add( "Three" );
    	strList.add( "Four" );
    	
    	strList.add( 1, "One and a Half" );

    	ListIterator<String> iterator = strList.listIterator();
    	// If an iterator tries to access an element that does not exist (eg. 
    	// in case the while condition is changed to true), a NoSuchElementException 
    	// is created and thrown.
    	while( iterator.hasNext() ) {
    		System.out.println(iterator.next());
    	}
    }

}
