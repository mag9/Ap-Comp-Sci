package com.stark.activities.ActivityFour;

/*
 * Code by Jeremy Stark
 */
import java.util.*;

public class ActivityFour_4 {

	public static double firstDub;
	public static double secondDub;

	public static int ans;

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] dippitydoo) {
		System.out.println("Enter an interger: ");
		firstDub = scanner.nextDouble();
		System.out.println("Enter another interger: ");
		secondDub = scanner.nextDouble();
		System.out.println("_____________________");
		ans = (int) (firstDub + secondDub);
		System.out.println(ans);
	}

}
