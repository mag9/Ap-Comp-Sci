package com.stark.activities.ActivitySix;

import java.util.Scanner;

public class ActivitySix_1 {

	public static void main(String[] dippitydoo) {
		double int1, int2, finalInt;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input a decimal number:");
		int1 = scanner.nextDouble();
		String s = Double.toString(int1);
		int dot = s.indexOf('.');
		
		System.out.println("Answer: " + s.substring(dot+1, dot+3));
		//System.out.println(dot);
	}	
}
