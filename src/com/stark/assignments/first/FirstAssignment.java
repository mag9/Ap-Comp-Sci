package com.stark.assignments.first;
/*
 * Code by Jeremy Stark
 */
import java.util.*;

public class FirstAssignment {
	
	public static void main(String[] dippitydoo){
		double test1, test2, testAverage;
		double quiz1, quiz2, quiz3, quizAverage;
		double homework;
		double finalAverage;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your test grades.");
		System.out.print("Test 1: "); 
		test1 = scanner.nextDouble();
		
		System.out.print("Test 2: ");
		test2 = scanner.nextDouble();
		System.out.println();
		
		testAverage = (test1 + test2) / 2;
		
		System.out.println("Please enter your quiz grades.");
		System.out.print("Quiz 1: ");
		quiz1 = scanner.nextDouble();
		
		System.out.print("Quiz 2: ");
		quiz2 = scanner.nextDouble();
		
		System.out.print("Quiz 3: ");
		quiz3 = scanner.nextDouble();
		System.out.println();
		
		quizAverage = (quiz1+quiz2+quiz3) / 3;
		
		System.out.println("Please enter your homework.");
		System.out.print("Homework: ");
		homework = scanner.nextDouble();
		System.out.println();
		
		finalAverage = (testAverage * 0.5) + (quizAverage * 0.3) + (homework * 0.2);
		
		System.out.println("Test Average: " + testAverage);
		System.out.println("Quiz Average: " + quizAverage);
		System.out.println("Final Grade: " + finalAverage);
	}
	
}