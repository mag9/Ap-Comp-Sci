package com.stark.lessons.unit4.lesson33;

public class Lesson_33_Activity_Four {

	public static int[] nums;
	
	public static void reverse(int[] a)
	{
		for (int i = 0; i < a.length / 2; i++)
		{
			final int index = (a.length-1)-i;
			final int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
		}
	}
	
	public static void main(String[] args)
	{
		int[] test = new int[] {1, 2, 3};
		reverse(test);
		for (int i = 0; i < test.length; i++)
		{
			System.out.print(test[i] + " ");
		}
	}
	
}
