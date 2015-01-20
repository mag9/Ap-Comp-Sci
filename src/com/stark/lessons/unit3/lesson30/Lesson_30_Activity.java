package com.stark.lessons.unit3.lesson30;

import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Lesson_30_Activity {

	public static String[] list = {"every", " near ing ", " checking", "food ", "stand", "value "};
	
	public static void main(String[] args)
	{
		for(int i = 0; i < list.length; i++)
		{
			out.println(list[i].replaceAll("\\s+",""));
		}
	}
}
