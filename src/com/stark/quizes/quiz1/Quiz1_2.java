package com.stark.quizes.quiz1;
/*
 * Code by Jeremy Stark and Reynor Lindsay
 */
import java.util.*;

public class Quiz1_2 {

	public static double disc,co1, co2, con, root1, root2;
	public static Scanner scan = new Scanner(System.in);
	
	public static void rootFunc(){
		System.out.println("Enter the coefficient of x squared: "); 
		co1 = scan.nextDouble();
		System.out.println("Enter the coefficient of x: ");
		co2 = scan.nextDouble();  
		System.out.println("Enter the constant: ");
		con = scan.nextDouble(); // get the brand new whoopty freakin doo constant and coefficient
		
		disc = (co2 * co2) - (4 * co1 * con); // calculate discriminate
		
		if (disc < 0){
			rootErrorFunc();
		} else {
			// calculate the different roots with the power of MATHHHHHHHHHH
			root1 = ((-co2 + Math.sqrt((co2 * co2) -(4 * co1 * con))) / (2 * co1));
			root2 = ((-co2 - Math.sqrt((co2 * co2) -(4 * co1 * con))) / (2 * co1));
				
			System.out.println("Root #1: " + root1);
			System.out.println("Root #2: " + root2);
		}
	}
	
	public static void rootErrorFunc() {	
		//this pretty much catches if the discrim is negative, bro.
		System.out.println("The discriminant is negative, please enter new values.");
		rootFunc();
	}
			
	
	public static void main(String[] args) { 
		rootFunc();
	}
	
}
