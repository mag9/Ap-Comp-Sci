package com.stark.lessons.unit1.ninthlesson;
/*
 * Code by Jeremy Stark
 */
import java.util.*;

public class LessonNine_2 {

	public static Random random = new Random();
	public static int randomN, randomN2;
	
	public static void main(String[] args){
		randomN = (int) Math.min(-20, 20);
		randomN2 = (int) Math.max(-20, 20);
		System.out.println(randomN + ", " + randomN2);
	}
	
}
