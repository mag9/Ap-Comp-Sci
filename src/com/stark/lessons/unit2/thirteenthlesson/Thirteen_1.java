package com.stark.lessons.unit2.thirteenthlesson;

import java.util.*;
import java.io.*;

public class Thirteen_1 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		int in;
		
		in = scanner.nextInt();
		
		if(in >= 0){
			ps.println("Positive");
		} else {
			ps.println("Negative");
		}
	}
}
