package com.sensei.ocaprep;

import java.io.IOException;

class OverrideParent {
	
	void method1( int param1 ) throws Exception {}
	Number method2( int param1, double param2 ) throws IOException { return 0; }
}

public class MethodOverridingTest extends OverrideParent {

	// thrown exceptions need not be a part of overriden methods 
	void method1( int param1 ) {
	}

	// return types can be covariant
	Integer method2( int param1, double param2 ) throws IOException {
		return 0;
	}
	
	

}
