package com.stark.assignments.WildCard;

import java.util.*;
import java.io.*;

public class WildCard {

	public static Scanner s = new Scanner(System.in);
	public static PrintStream ps = System.out;
	
	public static String String1;
	public static String String2;
	public static String finalString;
	
	public static char[] errorArray = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '!', '@', '#', '$', '%', '^', '&', 
										'(', ')', '-', '_', '+', '=', '`', '~', '{', '}', '[', ']', '|', '\'', ':', ';', '"',
										'<', '>', ',', '.', '?', '/'};
	
	public static void main(String[] args)
	{
		input();
	}
	
	public static void input()
	{
		ps.println("Enter the first String: ");
		String1 = s.nextLine();
		
		ps.println("Enter the replacement String: ");
		String2 = s.nextLine();
		
		errorCatch();
	}
	
	public static void errorCatch()
	{
		char[] stringAr = String1.toCharArray();
		
		for(int i = 0; i < stringAr.length; i++)
		{
			for(int y = 0; y < errorArray.length; y++)
			{
				if(stringAr[i] == errorArray[y])
				{
					ps.println("Error: Incorrect characters");
					return;
				}
			}
		}
		
		if(!String1.contains("*"))
		{
			ps.println("Error: no *");
			return;
		}
		
		stringInsertion();
	}
	
	public static void stringInsertion()
	{
		finalString = String1.replace("*", String2);
		
		output();
	}
	
	public static void output()
	{
		ps.println(finalString);
	}
	
}
