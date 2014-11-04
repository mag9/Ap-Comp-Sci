package com.stark.lessons.unit2.lessonfourteen;

import java.util.*;
import java.io.*;

public class Lesson_14_Activity_Two {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		int x, y;
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if(x >= 0 && y >= 0){
			ps.println("Both are positive or zero.");
		} else {
			ps.println("One or both are negative,");
		}
	}
	
}
