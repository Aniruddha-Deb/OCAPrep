package com.sensei.ocaprep;

public class StringBuilderTest {

	public static void main(String[] args) {
		String s = "CAFEBABE";
		System.out.println( s.replace( 'A', 'X' ) );
		System.out.println( s.replace( "A" , "X" ) );
		System.out.println( s.replace( "BABE" , "DEAD" ) );
		
		StringBuilder sb = new StringBuilder( "Long1203021sfs gibberish numeric" );
	}
	
}
