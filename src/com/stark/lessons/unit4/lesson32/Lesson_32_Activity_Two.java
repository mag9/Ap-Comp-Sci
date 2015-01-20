package com.stark.lessons.unit4.lesson32;

import java.io.*;
import java.util.*;

public class Lesson_32_Activity_Two {

	public static void monthDays(int a)
	{
		int days;
		
		days = a;
		
		if(a == 1)
			days = 31;
		if(a == 2)
			days = 28;
		if(a == 3)
			days = 31;
		if(a == 4)
			days = 30;
		if(a == 5)
			days = 31;
		if(a == 6)
			days = 30;
		if(a == 7)
			days = 31;
		if(a == 8)
			days = 31;
		if(a == 9)
			days = 30;
		if(a == 10)
			days = 31;
		if(a == 11)
			days = 30;
		if(a == 12)
			days = 31;
		
		System.out.println(days);
	}
	
	public static void main(String[] args)
	{
	}
}
