package com.stark.assignments.third;

import  java.util.Scanner;
import java.io.PrintStream;

public class Assignment_Three {

	public static Scanner scanner = new Scanner(System.in);
	public static PrintStream ps = System.out;
	public static int month, day;
	public static String monthString, dayString, horoString;
	
	public static void Input() {
		ps.println("What month were you born in?(number)");
		month = scanner.nextInt();
		ps.println("What day (number)");
		day = scanner.nextInt();
	}
	
	public static void monthConversion(){
		switch (month) {
        case 1:  
        	monthString = "January";
            break;
        case 2:  
        	monthString = "February";
        	break;
        case 3:  
        	monthString = "March";
        	break;
        case 4:  
        	monthString = "April";
        	break;
        case 5:  
        	monthString = "May";
        	break;
        case 6:  
        	monthString = "June";
        	break;
        case 7:  
        	monthString = "July";
        	break;
        case 8:  
        	monthString = "August";
        	break;
        case 9:  
        	monthString = "September";
        	break;
        case 10: 
        	monthString = "October";
        	break;
        case 11: 
        	monthString = "November";
        	break;
        case 12: 
        	monthString = "December";
        	break;
        default: 
        	monthString = "error";
        	break;
		}
	}
	
	public static void dayConversion(){
		switch (day) {
        case 1:  
        	dayString = "first";
            break;
        case 2:  
        	dayString = "second";
        	break;
        case 3:  
        	dayString = "third";
        	break;
        case 4:  
        	dayString = "fourth";
        	break;
        case 5:  
        	dayString = "fifth";
        	break;
        case 6:  
        	dayString = "sixth";
        	break;
        case 7:  
        	dayString = "seventh";
        	break;
        case 8:  
        	dayString = "eighth";
        	break;
        case 9:  
        	dayString = "nineth";
        	break;
        case 10: 
        	dayString = "tenth";
        	break;
        case 11: 
        	dayString = "eleventh";
        	break;
        case 12: 
        	dayString = "twelfth";
        	break;
        case 13:
        	dayString = "thirteenth";
        	break;
        case 14:
        	dayString = "fourteenth";
        	break;
        case 15:
        	dayString = "fiftheenth";
        	break;
        case 16:
        	dayString = "sixteenth";
        	break;
        case 17:
        	dayString = "seventeenth";
        	break;
        case 18:
        	dayString = "eighteenth";
        	break;
        case 19:
        	dayString = "nineteenth";
        	break;
        case 20:
        	dayString = "twentith";
        	break;
        case 21:
        	dayString = "twenty-first";
        	break;
        case 22:
        	dayString = "twenty-second";
        	break;
        case 23:
        	dayString = "twenty -third";
        	break;
        case 24:
        	dayString = "twenty-fourth";
        	break;
        case 25:
        	dayString = "twenty-fifth";
        	break;
        case 26:
        	dayString = "twenty-sixth";
        	break;
        case 27:
        	dayString = "twenthy-seventh";
        	break;
        case 28:
        	dayString = "twenty-eighth";
        	break;
        case 29:
        	dayString = "twenty-sinth";
        	break;
        case 30:
        	dayString = "thirtieth";
        	break;
        case 31:
        	dayString = "thirty-first";
        	break;
        default: 
        	monthString = "error";
        	break;
		}
	}
	
	public static void horoScope(){
		if((day >= 21 && month == 3) || (day <= 19 && month == 4)){
			horoString = "Aries";
		}
		if((day >= 20 && month == 4) || (day <= 20 && month == 5)){
			horoString = "Taurus";
		}
		if((day >= 21 && month == 5) || (day <= 20 && month == 6)){
			horoString = "Gemini";
		}
		if((day >= 21 && month == 6) || (day <= 22 && month == 7)){
			horoString = "Cancer";
		}
		if((day >= 23 && month == 7) || (day <= 22 && month == 8)){
			horoString = "Leo";
		}
		if((day >= 23 && month == 8) || (day <= 22 && month == 9)){
			horoString = "Virgo";
		}
		if((day >= 23 && month == 9) || (day <= 22 && month == 10)){
			horoString = "Libra";
		}
		if((day >= 23 && month == 10) || (day <= 21 && month == 11)){
			horoString = "Scorpio";
		}
		if((day >= 22 && month == 11) || (day <= 21 && month == 12)){
			horoString = "Sagittarius";
		}
		if((day >= 22 && month == 12) || (day <= 19 && month == 1)){
			horoString = "Capricorn";
		}
		if((day >= 20 && month == 1) || (day <= 18 && month == 2)){
			horoString = "Aquarius";
		}
		if((day >= 19 && month == 2) || (day <= 20 && month == 3)){
			horoString = "Pisces";
		}
	}
	
	public static void Output(){
		ps.println("Your birthday is: " + monthString + " " + dayString);
		ps.println(horoString);
		ps.println("Horoscope: " +horoString+ "25");
	}
	
	public static void main(String[] args){
		Input();
		monthConversion();
		dayConversion();
		horoScope();
		Output();
	}
}