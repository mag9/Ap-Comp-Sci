package com.stark.lessons.unit1.thirdlesson;

/*
 * Code by Jeremy Stark
 */
import java.util.Scanner;

public class ThirdLesson {

	public static void main(String[] dippitydoo) {
		Scanner scan = new Scanner(System.in); 
		String n; // Here, we name our string - that the user will input.
		n = scan.nextLine(); // We call the scanner to read user input into the
								// n" variable
		System.out.println("Hi " + n + ", nice to see you."); // Prints out
																// "Hello n, Nice to meet you."
	}

}
