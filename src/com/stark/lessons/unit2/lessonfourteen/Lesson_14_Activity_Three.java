package com.stark.lessons.unit2.lessonfourteen;

import java.util.*;
import java.io.*;

public class Lesson_14_Activity_Three {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = System.out;
		int first, second, third, fourth;
		boolean firstBool, secondBool, thirdBool, fourthBool;
		
		ps.println("Please enter the first octet: ");
		first = scanner.nextInt();
		ps.println("Please enter the second octet: ");
		second = scanner.nextInt();
		ps.println("Please enter the third octet: ");
		third = scanner.nextInt();
		ps.println("Please enter the fourth octet: ");
		fourth = scanner.nextInt();
		
		if(first >=0 && first <= 255){
			firstBool = true;
		} else {
			ps.println("Octer 1 is incorrect.");
			firstBool = false;
		}
		
		if(second>=0 && second <= 255){
			secondBool = true;
		} else {
			ps.println("Octer 2 is incorrect.");
			secondBool = false;
		}
		
		if(third >=0 && third <= 255){
			thirdBool = true;
		} else {
			ps.println("Octer 3 is incorrect.");
			thirdBool = false;
		}
	
		if(fourth >=0 && fourth <= 255){
			fourthBool = true;
		} else {
			ps.println("Octer 4 is incorrect.");
			fourthBool = false;
		}
		
		if((firstBool = true) && (secondBool = true) && (thirdBool = true) && (fourthBool = true)){
		} else {
			ps.println(first+"."+second+"."+third+"."+fourth);
		}
	}
}
