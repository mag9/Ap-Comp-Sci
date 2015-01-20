package com.stark.assignments.WildCard;

import java.util.*;
import java.io.*;

public class WildCard_NONOOP {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		PrintStream ps = System.out;
		
		String String1;
		String String2;
		String finalString;
		
		char[] errorArray = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '!', '@', '#', '$', '%', '^', '&', 
											'(', ')', '-', '_', '+', '=', '`', '~', '{', '}', '[', ']', '|', '\'', ':', ';', '"',
											'<', '>', ',', '.', '?', '/'};
		
		ps.println("Enter the first String: ");
		String1 = s.nextLine();
		
		ps.println("Enter the replacement String: ");
		String2 = s.nextLine();
		
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
				
		finalString = String1.replace("*", String2);
				
		ps.println(finalString);
	}
	
}
