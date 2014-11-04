package com.stark.activities.ActivityFive;

/*
 * Code by Jeremy Stark
 */
import java.util.*;

public class ActivityFive_1 {

	public static double radius;
	public static double circum;
	public static double area;

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] dippitydoo) {
		System.out.println("Enter the radius of the circle: ");
		radius = scanner.nextDouble();

		area = Math.PI * radius * radius; // area formula is pi * r * r
		circum = 2 * Math.PI * radius; // circumference formula is 2 * pi * r

		System.out.println("The circumference is exactly: " + circum);
		System.out.println("The area is exactly: " + area);
	}

}
