package com.stark.misc;
/*
 * Code by Jeremy Stark
 */
import java.util.Scanner;

public class Misc_1 {
	
	public static int num1, num2, finalNum;
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] dippitydoo) {
		System.out.println("Please enter two intergers.");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		if(num2 == 0){
			System.out.println(num1+ " divided by 0 is undefined.");
		} else {
			finalNum = num1 % num2;
			System.out.println("the remainder of " + num1 + "/" + num2 + " is " + finalNum + '.');
		}
	}
}