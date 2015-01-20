package com.stark.lessons.unit3.lesson29;

import java.util.Scanner;
import java.lang.Math; 

public class Lesson_29_Activity_One {
  
	public static String [] list = 
		{"high", "every", "nearing", "checking", "food ", 
		"stand", "value",  "best", "energy", "add", "grand", 
		"notation", "abducted", "food ", "stand"};
  
    public static void main(String[] args)
    {
    	int s = 0;
    	for (int i=0; i < list.length; i++)
    	{
    		if ( list[s].length() < list[i].length() )
    		{
    			s = i;
    		}
    	}
    	
    	System.out.println(list[s]);

    }
}