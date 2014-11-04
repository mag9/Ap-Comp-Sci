package com.stark.lessons.unit1.thirdlesson;

import java.util.*;

public class ThirdLesson_4 {

	public static String[] names = new String[3];
	public static String space = ", ";

	public static void main(String[] args) {
		String[] names = new String[3];
		String space = ", ";

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter three names: ");
		names[0] = scan.nextLine();
		names[1] = scan.nextLine();
		names[2] = scan.nextLine();
		System.out.println(names[2] + space + names[1] + space + names[0]);
	}

}
