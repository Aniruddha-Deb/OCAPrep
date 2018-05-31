package com.sensei.ocaprep;

class InitializerParent {
	public InitializerParent() {
		System.out.println( "This is the parent" );
	}
}

// this class shows that the initializer block is called after the implicit 
// call to super() in the constructor;

public class InitializerBlockTest extends InitializerParent{

	static { 
		System.out.println( "This is a static block, run when the class is loaded" ); 
	}
	
	{ System.out.println( "This is initializer block 1" ); }
	
	public InitializerBlockTest() {
		System.out.println( "This is the constructor" );
	}
	
	{ System.out.println( "This is initializer block 2" ); }
	
	static { 
		System.out.println( "This is the second static block, run after the first." ); 
	}
	
	public static void main(String[] args) {
		new InitializerBlockTest();
	}
}