package com.stark.lessons.unit1.thirdlesson;

/*
 * Code by Jeremy Stark
 */
import java.util.Scanner;

public class ThirdLesson_2 {

	public static void main(String[] dippitydoo) {
		Scanner scan = new Scanner(System.in);
		String n;
		String b;

		System.out.println("Hi there. What is your name?");
		n = scan.nextLine();
		System.out.println("What adjective describes you?");
		b = scan.nextLine();
		System.out.println("My name is " + n + ". I am " + b + ".");
	}

}
