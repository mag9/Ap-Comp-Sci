package com.stark.lessons.unit1.secondlesson;

/*
 //Code written by Jeremy Stark
 */
public class SecondLesson {

	public static int x = 5;
	public static int y = 3;

	public static void main(String[] dippitydoo) {

		// Here, you were asked to create an ASCI house, this is how you do so.
		System.out.println("   /\\");
		System.out.println("  /  \\");
		System.out.println(" /    \\");
		System.out.println(" |    |");
		System.out.println(" | || |");
		System.out.println(" | || |");

		// This was in the worksheet, how do brackets affect the math and
		// printing of a println.
		System.out.println("Answer = " + x + y);

		// Notice the parenthesis makes the adition of x and y a math problem.
		System.out.println("Answer = " + (x + y));
	}
}
