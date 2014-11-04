package com.stark.activities.ActivityFour;

/*
 * Code by Jeremy Stark
 */
import java.util.Scanner;

public class ActivityFour_1 {


	public static void main(String[] dippitydoo) {
		double num1, num2;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input your first number: ");
		num1 = scanner.nextDouble();
		System.out.println("Please input your second number: ");
		num2 = scanner.nextDouble();
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}

}
