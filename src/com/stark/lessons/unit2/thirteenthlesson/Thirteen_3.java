package com.stark.lessons.unit2.thirteenthlesson;

import java.io.PrintStream;
import java.util.Scanner;

public class Thirteen_3 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		int in1, in2;
		
		in1 = scanner.nextInt();
		in2 = scanner.nextInt();
		
		if(in1 == in2){
			ps.println("EQUAL");
		} else if(in1 > in2){
			ps.println(in1);
		} else if(in2 > in1){
			ps.println(in2);
		}
	}
	
}
