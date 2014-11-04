package com.stark.activities.ActivityFour;

import java.util.Scanner;

/*
 * Code by Jeremy Stark
 */
public class ActivityFour_2 {

	public static void main(String[] dippitydoo) {
		int[] ints = new int[4];

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input 4 numbers sepperated by spaces:");
		ints[0] = scanner.nextInt();
		ints[1] = scanner.nextInt();
		ints[2] = scanner.nextInt();
		ints[3] = scanner.nextInt();
		System.out.println("All of those numbers equal: "
				+ (ints[0] + ints[1] + ints[2] + ints[3]));
	}

}
