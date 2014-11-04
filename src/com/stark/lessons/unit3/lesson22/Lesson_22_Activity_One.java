package com.stark.lessons.unit3.lesson22;

import java.util.*;
import java.io.*;

public class Lesson_22_Activity_One 
{

	public static void main(String[] args)
	{
		PrintStream ps = System.out;
		Scanner s = new Scanner(System.in);
		String userIn;
		
		ps.println("Enter a string: ");
		userIn = s.nextLine();
		
		char[] userInArray = userIn.toCharArray();
		
		for(int i = 0; i < userIn.length(); i++)
		{
			ps.println(userInArray[i] + "\n");
		}
	}
	
}
