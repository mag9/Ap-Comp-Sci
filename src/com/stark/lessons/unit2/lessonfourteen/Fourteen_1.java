package com.stark.lessons.unit2.lessonfourteen;

import java.io.*;
import java.util.*;

public class Fourteen_1 {
	
	public static void main(String[] args){
		int userIn;
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		
		ps.println("Enter a number: ");
		userIn = scanner.nextInt();
		
		if(userIn >= 5 && userIn <= 76){
			ps.println("False");
		} else if (userIn <=5 || userIn >=76) {
			ps.println("True");
		}
	}
	
}
