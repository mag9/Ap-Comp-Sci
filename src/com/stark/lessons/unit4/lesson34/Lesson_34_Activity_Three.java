package com.stark.lessons.unit4.lesson34;

public class Lesson_34_Activity_Three 
{
	public static int findMax(int[] f)
	{
		int max = 0;
		for(int i = 0; i < f.length; i++)
		{
			 if(f[i] > max)
			 {
				 max = f[i];
			 }
		}
		
		return max;
	}
	
	public static void main(String[] args)
	{
	}
	
}
