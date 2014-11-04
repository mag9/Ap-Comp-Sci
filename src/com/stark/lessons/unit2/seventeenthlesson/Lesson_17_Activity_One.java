package com.stark.lessons.unit2.seventeenthlesson;

import java.io.PrintStream;
import java.util.Scanner;

public class Lesson_17_Activity_One {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       
	       System.out.println("Enter the Scores: ");
	       
	       int x = 0;
	       int c = 0;
	       double sum = 0;
	       while (x != -1)
	       {
	           x = scanner.nextInt();
	           c++;
	           sum = sum + x;
	       }
	       c--;
	       sum++;
	       System.out.println("The average is: " + (double)(sum / c));
	       
	}
}