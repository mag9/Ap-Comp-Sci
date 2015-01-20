package com.stark.lessons.unit4.lesson34;

public class Lesson_34_Activity_Six 
{
	public static boolean allpos;
	
	public static boolean allPositive(int[] f)
	{
		for(int i = 0; i < f.length; i++)
		{
			if(f[i] >= 0)
			{
				allpos = true;
			} else {
				allpos = false;
			}
		}
		
		return allpos;
	}
	
	public static void main(String[] args)
	{
	}
	
}
