package com.stark.lessons.unit3.lesson24;

import java.util.*;
import java.io.*;

public class Lesson_24_Activity_One 
{
	
	public static PrintStream ps = System.out;
	
	public static int lineLength = 0;
	
	public static void main(String[] args)
	{
		for(int i = 23; i <= 89; i++)
		{
			ps.print(i + " ");
			lineLength++;
			
			if(lineLength >= 10){
				ps.println("\n");
				lineLength = 0;
			}
		}
	}
	
}
