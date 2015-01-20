package com.stark.lessons.unit4.lesson32;

public class Lesson_32_Activity_Four {

	public static void realTime(int seconds)
	{
		int minutes = seconds / 60;
		seconds -= (minutes * 60);
		
		int hours = minutes / 60;
		
		minutes -= (hours * 60);
		
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
	}
 
	public static void main(String[] spanky)
	{
		
	}

}
