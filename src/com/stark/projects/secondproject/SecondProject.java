package com.stark.projects.secondproject;
/*
 * Code by Jeremy Stark
 */
import java.util.*;
import java.io.*;

public class SecondProject {
	
		public static void main(String[] args){
			double itemCost, amountPaid, changeOwed, changeOwedRound;
			double quarters, dimes, nickels, pennies;
	
			Scanner scanner = new Scanner(System.in);
	
			PrintStream sys = System.out;
		
			sys.println("Please Enter the Cost of the Item:");
			itemCost = scanner.nextDouble();
			sys.println("Please Enter the Amount Paid:");
			amountPaid = scanner.nextDouble();
			sys.println("\n");

			changeOwed = (amountPaid - itemCost);
			changeOwedRound = Math.round(changeOwed*100);
			double change = changeOwedRound;
			
			quarters = (int)(change / 25);
			change = change - quarters * 25;
			
			dimes = (int)(change / 10);
			change = change - dimes * 10;
			
			nickels = (int)(change / 5);
			change = change - nickels *5;
			
			pennies = (int)(change/1);
			change = change - pennies * 1;
	
			sys.println("Change Owed: " + changeOwedRound/100);
			sys.println("Quarters: " + (int)quarters);
			sys.println("Dimes: " + (int)dimes);
			sys.println("Nickels: " + (int)nickels);
			sys.println("Pennies: " + (int)pennies);
		}
	
}
