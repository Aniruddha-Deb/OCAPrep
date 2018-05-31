package com.sensei.ocaprep;

class InitializerParent {
	public InitializerParent() {
		System.out.println( "This is the parent" );
	}
}

// this class shows that the initializer block is called after the implicit 
// call to super() in the constructor;

public class InitializerBlockTest extends InitializerParent{

	{ System.out.println( "This is initializer block 1" ); }
	
	public InitializerBlockTest() {
		System.out.println( "This is the constructor" );
	}
	
	{ System.out.println( "This is initializer block 2" ); }
	
	public static void main(String[] args) {
		new InitializerBlockTest();
	}
}