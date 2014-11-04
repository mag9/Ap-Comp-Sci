package com.stark.activities.ActivityFive;

/*
 * Code by Jeremy Stark
 */
import java.util.*;

public class ActivityFive_2 {

	public static void main(String[] dippitydoo) {
		Scanner scanner = new Scanner(System.in);
		double price;
		double finalPrice;
		
		System.out.println("Enter a price: ");
		price = scanner.nextDouble();
		finalPrice = 20 - price;
		System.out.println("Change from a $20: " +"$"+ finalPrice);
	}

}
