package com.stark.activities.ActivityFour;

/*
 * Code by Jeremy Stark
 */
import java.util.Scanner;

public class ActivityFour_3 {

	public static void main(String[] dippitydoo) {
		int age;
		int modage;

		String name;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi there. What is your name?");
		name = scanner.next();
		System.out.println("Hi" + name + ". How old are you?");
		age = scanner.nextInt();
		modage = (100 - age);
		System.out.println(name + ", you will be 100 in " + modage + " years.");
	}

}
