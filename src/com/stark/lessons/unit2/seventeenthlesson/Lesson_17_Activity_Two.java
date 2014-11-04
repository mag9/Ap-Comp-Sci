package com.stark.lessons.unit2.seventeenthlesson;

import java.util.*;
import java.io.*;

public class Lesson_17_Activity_Two {

	public static Scanner scanner = new Scanner(System.in);
	public static int a, b;
	public static int c = 0;
	
	public static void input() {
		a = scanner.nextInt();
		b = scanner.nextInt();
		catchAll();
	}
	
	public static void catchAll(){
		if(a > b){
			System.out.println("First number is larger than second number, please enter a new one.");
			input();
		}
	}
	
	public static void evenCheck(){
		if (a%2 == 1){
			a = a + 1;
		}
			c = a;
	}
 
	public static void output(){
		while(c <= b){
			System.out.print(c + " ");
			c = c +2;
		}
    }
	
	public static void main(String[] args){
		input();
		evenCheck();
		output();
	}
}