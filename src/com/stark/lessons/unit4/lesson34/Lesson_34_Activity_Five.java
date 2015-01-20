package com.stark.lessons.unit4.lesson34;

public class Lesson_34_Activity_Five
{
	public static int sumEven(int[] f)
	{
		int sum = 0;
		for(int i = 0; i < f.length; i++)
		{
			if(f[i] % 2 == 0)
			{
				sum += f[i];
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
	}
	
}
