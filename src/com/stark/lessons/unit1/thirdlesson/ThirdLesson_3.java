package com.stark.lessons.unit1.thirdlesson;

/*
 * Code by Jeremy Stark
 */
import java.util.Scanner;

public class ThirdLesson_3 {

	public static void main(String[] dippitydoo) {
		Scanner scan = new Scanner(System.in);
		String name1;
		String name2;
		String name3;

		System.out.println("Write Name 1 then press enter: ");
		name1 = scan.nextLine();
		System.out.println("Write Name 2 then press enter: ");
		name2 = scan.nextLine();
		System.out.println("Write Name 3 then press enter: ");
		name3 = scan.nextLine();
		System.out.println(name3 + ", " + name2 + ", " + name1);
	}

}
