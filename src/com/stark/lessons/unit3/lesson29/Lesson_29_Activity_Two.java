package com.stark.lessons.unit3.lesson29;

import static java.lang.System.out;

public class Lesson_29_Activity_Two {

	public static String[] list = {"every", "nearing", "checking", "food", "stand", "value"};
	
	public static void main(String[] args)
	{
		
		String reverse = null;
		
		for(int i = 0; i < list.length; i++)
		{
			out.println(new StringBuilder(list[i]).reverse().toString());
		}
		
	}
	
}
