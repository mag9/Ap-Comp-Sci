package com.stark.lessons.unit4.lesson33;

public class Lesson_33_Activity_Five {

	 public static void insertValue(int[] ints, int value, int index)
	    {
	        for (int i = ints.length - 1; i > index; i--)
	        {
	            ints[i] = ints[i-1];
	        }
	        ints[index] = value;
	    }
	 
	 public static void main(String[] args)
	 {
		 
	 }
	
}
