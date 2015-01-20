package com.stark.assignments.MergeArrays;

import java.util.*;
import java.io.*;

public class MergeArray 
{
	
	public static PrintStream ps = System.out;

	public static MergeArray ma = new MergeArray();
	
	// the first array and it's shorter version.
	public static int[] firstAr = new int[10000];
	public static int[] firstArShort;
	public static int firstArShortLength;
	
	//The second array and it's shorter version.
	public static int[] secondAr = new int[10000];
	public static int[] secondArShort;
	public static int secondArShortLength;
	
	//The final array.
	public static int[] finalAr;
	
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		ma.input();
	}
	
	public void input()
	{
		ps.println("Enter the values for the first array, up to 10000 values, enter a negative number to quit");
		
		
		firstArLoop:
		for(int i = 0; i < firstAr.length; i++)
		{
			firstAr[i] = s.nextInt();
			
			if(firstAr[i] < 0)
			{
				break firstArLoop;
			}
		}
		
		
		ps.println("Enter the values for the second array, up to 10000 values, enter a negative number to quit");
		
		secondArLoop:
		for(int i = 0; i < secondAr.length; i++)
		{
			secondAr[i] = s.nextInt();
			
			if(firstAr[i] < 0)
			{
				break secondArLoop;
			}
		}
		
		Arrays.sort(firstAr);
		Arrays.sort(secondAr);
		
		// Now, we create two new Arrays that will contain
		// The actual length and amount for use in the
		// The merging algorithm
		ps.println("First Array:");
		for(int i = 0; i < firstAr.length; i++)
		{
			
		}
		
		ps.println("Second Array:");
		for(int i = 0; i < secondAr.length; i++)
		{
			ps.print(secondAr[i] + " ");
		}
		
		ma.algo();
	}
	
	public static void algo()
	{
		
	}
}
