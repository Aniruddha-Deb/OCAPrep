package com.sensei.ocaprep;

abstract class Parent {
	
	String name = "Abstract";
	
	// concrete method in an abstract class, accessible by children
	String getName() {
		return name;
	}
}

class AbstractClassTest extends Parent {

	public static void main(String[] args) {
		System.out.println( new AbstractClassTest().getName() );
	}
}
