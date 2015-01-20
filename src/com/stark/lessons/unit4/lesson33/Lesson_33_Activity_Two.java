package com.stark.lessons.unit4.lesson33;

public class Lesson_33_Activity_Two 
{
	
	public static void randomize(int[] a)
	{
		final int min = 10;
		final int max = 99;
		final int range = (max + 1)-min;
		for (int i = 0; i < a.length; i++)
		{
	        a[i] = (int)(Math.random() * (range)) + min;
		}
	}
	
	public static void main(String[] args)
	{
	}
	
}
