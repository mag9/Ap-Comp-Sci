package com.stark.randomStuff.writingAlgo;

import java.util.*;
import java.io.*;

public class CustomAlgo {

	public static Scanner s = new Scanner(System.in);
	public static PrintStream ps = System.out;
	public static List<Integer> farfar37 = new ArrayList<Integer>();
	public static boolean running = true;
	public static String notRunning = new String("!");
	
	
	public static void input()
	{
		ps.println("Please Enter a String of Numbers: ");
		ps.println("Enter \"0000\" When finished.");

		while(running)
		{
			farfar37.add(s.nextInt());
			
			if(farfar37.contains(0000))
			{
				running = false;
			}
		}

		ps.println("Unsorted: " + farfar37);
		
		Collections.sort(farfar37);
		
		ps.println("Sorted: " + farfar37);
	}
	
	public static void main(String[] String_Howdy)
	{
		input();
	}
	
}
