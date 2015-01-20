package com.stark.lessons.unit4.lesson34;

public class Lesson_34_Activity_Two 
{
	
	public static double average(int[] b)
	{
		int sum = 0;
		double av = 0;
		for(int i = 0; i < b.length; i++)
		{
			sum += b[i];
		}
		av = sum / (double)b.length;
		
		return av;
	}

}
