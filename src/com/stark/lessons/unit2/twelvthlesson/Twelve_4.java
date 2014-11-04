package com.stark.lessons.unit2.twelvthlesson;

import java.util.*;
import java.io.*;

public class Twelve_4 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		double temp;
		
		ps.println("What is the temperature?");
		temp = scanner.nextDouble();
		
		if(temp >= 99 && temp <= 102){
			
		} else {
			ps.println("WARNING");
		}
	}	
}
