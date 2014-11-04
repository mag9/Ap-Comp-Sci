package com.stark.lessons.unit2.thirteenthlesson;

import java.io.*;
import java.util.*;

public class Thirteen_6 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		double temp;
		
		ps.println("What is the temperature?");
		temp = scanner.nextDouble();
		
		if(temp >= 99 && temp <= 102){
			ps.println("Temperature is OK");
		} else {
			ps.println("WARNING");
		}
	}	
	
}
