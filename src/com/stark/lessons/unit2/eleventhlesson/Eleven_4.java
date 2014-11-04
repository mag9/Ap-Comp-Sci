package com.stark.lessons.unit2.eleventhlesson;

import java.io.*;
import java.util.*;

public class Eleven_4 {

	public static void main(String[] args){
		int a, f;
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		
		a = scanner.nextInt();
		if(a % 2 == 0){
			ps.println("Even");
		} else {
			ps.println("Odd");
		}
	}
	
}
