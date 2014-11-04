package com.stark.projects.firstproject;

/*
 * Code by Jeremy Stark
 */
import java.util.*;

public class FirstProject {

	public static Scanner scanner = new Scanner(System.in);

	// You can do more precise math with doubles.
	// Also doubles are more user friendly.
	public static double fahr; // Fahrenheit temperature.
	public static double cel; // Celsius temperature

	public static void main(String[] dippitydoo) {
		System.out.println("Enter degrees in Fahrenheit:"); // Tell user to
															// input fehrenheit
															// degrees
		fahr = scanner.nextDouble(); // use scanner to put into the fahr
										// variable
		cel = ((fahr - 32) * 5) / 9; // setting cel = the conversion formula
										// using the new fahr numbers.
		System.out.println("The equivalent in Celsius is: " + cel); // Print out
																	// the
																	// equivalent
																	// in
																	// Celsius.
	}

}
