package com.stark.lessons.unit4.lesson35;

public class Lesson_35_Activity {

	public static int randomize(int a, int b)
	{
            final int min = a;
            final int max = b;
            final int range = (max + 1)-min;
            int rand = (int)(java.lang.Math.random() * (range)) + min;

            return rand;
	}
	
	public static int randomize(int a)
	{
            final int min = 0;
            final int max = a;
            final int range = (max + 1)-min;
            int rand = (int)(java.lang.Math.random() * (range)) + min;

            return rand;
	}
	

	public static double randomize(double a)
	{
		final double min = 0;
		final double max = a;
		final double range = (max)-min;
	    final double rand = (java.lang.Math.random() * (range)) + min;
		
		return rand;
	}
	
	public static double randomize(double a, double b)
	{
		final double min = a;
		final double max = b;
		final double range = (max)-min;
	    final double rand = (java.lang.Math.random() * (range)) + min;
		
		return rand;
	}
	
	public static void main(String[] args)
	{
	}
	
}