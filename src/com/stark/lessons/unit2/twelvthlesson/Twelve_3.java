package com.stark.lessons.unit2.twelvthlesson;

import java.util.*;
import java.io.*;

public class Twelve_3 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		double score;
		
		ps.println("Enter a test score: ");
		score = scanner.nextDouble();
		
		if(score <= 100 && score > 0){
			ps.println("Valid");
		} else {
			ps.println("Not Valid");
		}
	}
	
}
