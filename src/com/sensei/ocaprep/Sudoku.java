package com.sensei.ocaprep;

/**
 * 
 * Taken from Selikoff and Boyarsky 4-28.
 * This is one of the most niche concepts I have encountered in Java. Hats off 
 * to the authors for coming up with this one.
 * 
 * @author Scott Selikoff 
 * @author Jeanne Boyarsky
 *
 */
public class Sudoku {

	static int[][] game = new int[6][6];
	// this is a variation of the question in which a compilation error is
	// thrown by line 26.
	// static int[][] game;
	
	public static void main( String[] args ) {
		game[3][3] = 6;
		// this line of code throws an ArrayStoreException because obj[] is 
		// initialized as an int[], hence a string cannot be assigned to it. 
		Object[] obj = game;
		obj[3] = "X";
		// game[3][3] = "X";
		System.out.println(game[3][3]);
	}
}
