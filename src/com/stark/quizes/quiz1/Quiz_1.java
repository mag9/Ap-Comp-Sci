package com.stark.quizes.quiz1;
/*
 * Code by Jeremy Stark and Reynor Lindsay
 */
import java.util.*;
 
public class Quiz_1 {
 
    public static int seconds, origSeconds, minutes, hours, finalSeconds;
     
    public static Scanner scanner = new Scanner(System.in);
     
    public static void main(String[] Hi_Mr_M){
        inputAlg(); //Calls the input Method
        allCatch(); //Calls the allCatch method to catch if the input is negative or decimal. 
        secondsAlg(); //Calls the secondsAlg method to run the conversion code.
    }
     
    public static void inputAlg(){
        System.out.println("Enter a numer of seconds: ");
        seconds = scanner.nextInt();
        origSeconds = seconds;
    }
     
    public static void secondsAlg(){
        hours = seconds / 3600; // find hours
        minutes = (seconds - (hours*3600))/60;  // find minutes
        finalSeconds = (seconds - (3600*hours) - (minutes*60));  // find seconds
         
        System.out.println(origSeconds + " seconds is equal to " + hours + " hour(s) " + minutes + " minute(s) and " + finalSeconds + " second(s).");
    }
     
    public static void allCatch(){
        if (seconds <= 0){
            System.out.println("Negative seconds are not accepted. Please re-enter your seconds.");
            inputAlg();
        }
    }
     
}