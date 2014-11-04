package com.stark.lessons.unit2.thirteenthlesson;

import java.io.PrintStream;
import java.util.Scanner;

public class Thirteen_4 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		int grade;
		
		grade = scanner.nextInt();
		
		if(grade == 0){
			ps.println("F");
		}
		
		if(grade == 1){
			ps.println("D");
		}
		
		if(grade == 2){
			ps.println("C");
		}
		
		if(grade == 3){
			ps.println("B");
		}
		
		if(grade == 4){
			ps.println("A");
		}
	}
}
