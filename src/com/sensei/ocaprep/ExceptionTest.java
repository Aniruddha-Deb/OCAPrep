package com.sensei.ocaprep;

import java.io.IOException;

class ExceptionTestParent {
	public int test() throws IOException { return -1; }
}

public class ExceptionTest extends ExceptionTestParent {
	
	public int test() { return 5; }

	public static void main(String[] args) throws IOException {
		try {
			int count = 1;
			// this is possible
		} catch( Throwable t ) {
			// do nothing
		} 
		
		// catch blocks can have duplicate variable names!!!
		try {
			System.out.println( "Hello" );
			throw new IOException();
		} catch( IOException ex ) {}
		catch( Exception ex ) {}
	}
}
