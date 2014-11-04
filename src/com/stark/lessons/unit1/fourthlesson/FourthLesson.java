package com.stark.lessons.unit1.fourthlesson;

/*
 * Code by Jeremy Stark
 */
import java.util.Scanner;

public class FourthLesson {

	public static Scanner scanner = new Scanner(System.in);

	public static int age, newAge;

	public static void main(String[] dippitydoo) {
		System.out.println("How old are you?: ");
		age = scanner.nextInt();
		newAge = 100 - age;
		System.out.println(newAge);
	}

}
