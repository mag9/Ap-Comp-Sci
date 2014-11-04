package com.stark.lessons.unit1.ninthlesson;
/*
 * Code by Jeremy Stark
 */
import java.util.*;

public class LessonNine_3 {

	public static Random random = new Random();
	public static int randomN;
	
	public static int testing = 40-20;
	
	public static void main(String[] args){
		randomN = random.nextInt(40-20) + 20;
		System.out.println(randomN);
	}
	
}
