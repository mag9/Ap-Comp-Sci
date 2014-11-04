package com.stark.lessons.unit2.seventeenthlesson;

import java.util.*;
import java.io.*;

public class Lesson_17_Activity_Two_1 {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a, b;
		int c = 0;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if (a%2 == 1){
			a = a + 1;
		}
			c = a;
			
		while(c <= b){
		System.out.print(c + " ");
			c = c +2;
		}
	}
}