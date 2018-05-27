package com.sensei.ocaprep;

interface Interface1 {
	
	int INDEX = 1;
	
	void doStuff();
	// default String getName() { return "Interface1"; }
}

interface Interface2 {
	
	int INDEX = 2;
	
	void doStuff();
	// default String getName() { return "Interface2"; }
}

public interface InterfaceExtendingMultipleInterfaces extends Interface1, Interface2 {

	default void test() {

	}

}
