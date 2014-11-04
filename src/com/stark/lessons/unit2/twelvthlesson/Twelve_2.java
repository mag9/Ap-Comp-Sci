package com.stark.lessons.unit2.twelvthlesson;

import java.util.*;
import java.io.*;

public class Twelve_2 {

	public static void main(String[] args){
		double x, y;
		PrintStream ps = System.out;
		Scanner scanner = new Scanner(System.in);
		
		ps.println("Please Enter Two Numbers: ");
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		
		if(x > y){
			ps.println("Largest is: " + x);
		} else {
			ps.println("Largest is: " + y);
		}
		
		if(x == y){
			ps.println("Largest is: " + x);
		}
	}
	
}
