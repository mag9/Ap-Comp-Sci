package com.stark.lessons.unit2.thirteenthlesson;

import java.io.*;
import java.util.*;

public class Thirteen_5 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		double ranX, ranY;
		double userIn;
		
		ranX = (int)(Math.random() * (13 - 1) + 1);
		ranY = (int)(Math.random() * (13 - 1) + 1);
		ps.println(ranX);
		ps.println(ranY);
		
		userIn = scanner.nextDouble();
		
		if(userIn == (ranX*ranY)){
			ps.println("Correct!");
		} else {
			ps.println("Wrong");
		}
	}
}