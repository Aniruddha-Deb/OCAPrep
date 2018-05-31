package com.sensei.ocaprep;

public class DatatypeTest {
	
	static long hexLiteral = 0x55AC34BL;
	
	// hmm. Very interesting as to how overflow and typecasting happens.
	// the last byte (1001 1000) is treated as a sign bit. The value of 
	// (001 1000) is 24 and this is added to the lower bound, resulting in a
	// value of -104.
	static byte overflowHexLiteral = (byte)152;

	public static void main(String[] args) {
		System.out.println( hexLiteral );
		System.out.println( overflowHexLiteral );
		
		Boolean b1 = Boolean.parseBoolean( "True" );
		Boolean b2 = Boolean.parseBoolean( "Not True" );
		Boolean b3 = Boolean.parseBoolean( "True" );
		System.out.println( b1 != b2 );
		// value caching. this is true;
		System.out.println( b1 == b3 );
		
	}
	
}
