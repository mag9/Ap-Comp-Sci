package com.stark.lessons.unit2.thirteenthlesson;

import java.io.PrintStream;
import java.util.Scanner;

public class Thirteen_2 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		int in;
		
		in = scanner.nextInt();
		
		if(in >= 60){
			ps.println("passing");
		} else{
			ps.println("failing");
		}
	}
	
}
