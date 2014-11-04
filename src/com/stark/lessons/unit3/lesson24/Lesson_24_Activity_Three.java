package com.stark.lessons.unit3.lesson24;

import java.util.*;
import java.io.*;

public class Lesson_24_Activity_Three 
{
	public static void main(String[] args)
	{
		PrintStream ps = System.out;
		Scanner s = new Scanner(System.in);
		int userIn;
		
		ps.println("Enter a number between 0 and 100:");
		userIn = s.nextInt();
		
		if(userIn < 0 || userIn > 100)
		{
			ps.println("error");
		} else {
			for(int i = userIn; i <= 100; i++)
			{
				ps.println(i);
			}
		}
	}
	
}
