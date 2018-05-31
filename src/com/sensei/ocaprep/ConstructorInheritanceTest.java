package com.sensei.ocaprep;

class ConstructorParent {
	
//	public ConstructorParent() {
//		System.out.println( "This is an unparameterized constructor" );
//	}
	
	public ConstructorParent( int parameter ) {
		System.out.println( "This is a parameterized constructor " + parameter );
	}  
}

public class ConstructorInheritanceTest extends ConstructorParent {

	// If the super class does not contain a default ( or unparameterized ) 
	// constructor, then a new constructor has to be created in the child
	// whose first statement is the call to super( parameters );
	
	// the above concept is based on the specification that Java automatically 
	// inserts super() as the first statement into any constructor that is 
	// created in a subclass. If the super() parameterless constuctor is not 
	// present in the superclass, then the above case comes into play.
	
	public ConstructorInheritanceTest() {
		super( 5 );
	}
	
	public ConstructorInheritanceTest( int parameterized ) {
		super( parameterized );
	}
	
	public static void main(String[] args) {
		new ConstructorInheritanceTest();
		new ConstructorInheritanceTest( 7 );
	}
}
