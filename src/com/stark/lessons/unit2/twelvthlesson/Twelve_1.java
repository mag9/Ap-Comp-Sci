package com.stark.lessons.unit2.twelvthlesson;

import java.util.*;
import java.io.*;

public class Twelve_1 {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		double z = scanner.nextDouble();
		double a = (double)((x + y + z)/3);
		
		if(a >= 89.5){
		    ps.println("ABOVE AVERAGE");
		}
	}
	
}
