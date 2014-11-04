package com.stark.lessons.unit3.lesson23;

import java.util.*;
import java.io.*;

public class Lesson_23_DiscussionPost 
{

	public static int[] intsdawg = new int[5];
	public static Random random = new Random();
	
	public static void main(String[] args)
	{
		for(int i = 0; i < intsdawg.length; i++)
		{
			intsdawg[i] = random.nextInt();
			System.out.println(intsdawg[i]);
		}
	}
	
}
