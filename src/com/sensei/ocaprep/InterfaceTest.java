package com.sensei.ocaprep;

public interface InterfaceTest {

	// variable is public, static and final by default
	String MIN_DIST = "5";
	
	void toBeImplemented();
	
	// default implementation
	// note that this can be overriden
	default void implementedThroughDefault() {
		System.out.println( "This method is implmented" );
	}
	
	// this can't be overriden
	static void utilityMethod() {
		System.out.println( "This is static" );
	}
}

interface CollisionExample {
	// this interface also defines MIN_DIST
	int MIN_DIST = 5;
	
	// this causes another collision
	// String toBeImplemented();
}

class ClassThatImplementsInterfaceTest implements InterfaceTest, CollisionExample {

	@Override
	public void toBeImplemented() {
		System.out.println( "Implemented by " + getClass().getName() );
	}
	
	static void utilityMethod() {
		System.out.println( "This method does not collide with the utilityMethod "
				+ "in InterfaceTest" );
	}
	
	void variableCollisionExample() {
		// uncommenting the below line results in a complation error as the call
		// to the variable MIN_DIST is ambiguous
		// System.out.println( MIN_DIST );
		// prefixing with the interface name removes this ambiguity
		System.out.println( CollisionExample.MIN_DIST );
		System.out.println( InterfaceTest.MIN_DIST );
	}
	
}
