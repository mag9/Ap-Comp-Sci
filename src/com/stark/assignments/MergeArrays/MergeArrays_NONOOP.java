package com.stark.assignments.MergeArrays;

import java.util.*;
import java.io.*;

public class MergeArrays_NONOOP
{
	
	public static void main(String[] args)
	{
		PrintStream ps = System.out;

		// the first array and it's shorter version.
		int[] firstAr = new int[10000];
		int[] firstArShort = null;
		int firstArShortLength = 0;
		
		//The second array and it's shorter version.
		int[] secondAr = new int[10000];
		int[] secondArShort = null;
		int secondArShortLength = 0;
		
		//The final array.
		int[] finalAr;
		
		Scanner s = new Scanner(System.in);
		
		ps.println("Enter the values for the first array, up to 10000 values, enter a negative number to quit");
		
		
		firstArLoop:
		for(int i = 0; i < firstAr.length; i++)
		{
			firstAr[i] = s.nextInt();
			firstArShortLength++;
			
			if(firstAr[i] < 0)
			{
				break firstArLoop;
			}
		}
		firstArShort = new int[firstArShortLength - 1];
		
		ps.println("\n" + "Enter the values for the second array, up to 10000 values, enter a negative number to quit");
		
		secondArLoop:
		for(int i = 0; i < secondAr.length; i++)
		{
			secondAr[i] = s.nextInt();
			secondArShortLength++;
			
			if(secondAr[i] < 0)
			{
				break secondArLoop;
			}
		}
		
		secondArShort = new int[secondArShortLength - 1];
		
		// Now, we create two new Arrays that will contain
		// The actual length and amount for use in the
		// The merging algorithm
		ps.println("First Array:");
		
		for(int i = 0; i < firstArShort.length; i++)
		{
			firstArShort[i] = firstAr[i];
			ps.print(firstArShort[i] + " ");
		}
		ps.println("\n"); //Creates new line for second array print
		
		ps.println("Second Array:");
		for(int i = 0; i < secondArShort.length; i++)
		{
			secondArShort[i] = secondAr[i];
			ps.print(secondArShort[i] + " ");
		}
		ps.println("\n");
		
		for(int i = 0; i < firstArShort.length - 1; i++)
		{
			if(firstArShort[i] >= firstArShort[i += 1])
			{
				ps.println("ERROR: Array not in correct order 1");
				return;
			}
		}
		
		for(int i = 0; i < secondArShort.length - 1; i++)
		{
			if(secondArShort[i] >= secondArShort[i += 1])
			{
				ps.println("ERROR: Array not in correct order");
				return;
			}
		}
		
			int length = firstArShort.length + secondArShort.length;
	        int[] result = new int[length];
	        System.arraycopy(firstArShort, 0, result, 0, firstArShort.length);
	        System.arraycopy(secondArShort, 0, result, secondArShort.length, secondArShort.length);
		
		finalAr = result;
		
		Arrays.sort(finalAr);
		
		ps.println("Merged Array:");
		for(int i = 0; i < finalAr.length; i++)
		{
			ps.print(finalAr[i] + " ");
		}
	}
}