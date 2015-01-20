package com.stark.lessons.unit4.lesson34;

public class Lesson_34_Activity_Four 
{
	public static int min;
	
	public static int findMin(int[] f)
	{
		min = f[0];
		
		for(int i = 0; i < f.length; i++)
		{
			if(f[i] < min){
				min = f[i];
			}
		}
		
		return min;
	}
	
	public static void main(String[] args)
	{
	}
	
}
