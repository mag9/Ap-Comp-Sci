package com.stark.assignments.MergeArrays;

import java.util.*;
import java.io.*;

public class MergeArrays_Test
{
	
	public static PrintStream ps = System.out;

	public static MergeArrays_Test mat = new MergeArrays_Test();
	
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
		mat.input();
	}
	
	public void input()
	{
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
		
		mat.orderCheck();
	}
	
	public static void orderCheck()
	{
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
		
		mat.algo();
	}
	
	public static int[] combine(int[] a, int[] b)
	{
        int length = a.length + b.length;
        int[] result = new int[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
	
	public static void algo()
	{
		finalAr = combine(firstArShort, secondArShort);
		
		Arrays.sort(finalAr);
		
		ps.println("Merged Array:");
		for(int i = 0; i < finalAr.length; i++)
		{
			ps.print(finalAr[i] + " ");
		}
	}
}