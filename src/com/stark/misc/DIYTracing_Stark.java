package com.stark.misc;
//Code by Jeremy Stark
import java.util.Scanner;
import java.io.*;

public class DIYTracing_Stark
{ 
	
	public static Scanner scanner = new Scanner(System.in);
	public static String input;
	public static PrintStream ps = System.out;
	
    public static void main(String[] args) 
    {
    	ps.println("Enter a string: ");
    	
    	input = scanner.nextLine();
    	
        char[] inputChars = input.toCharArray();
        
        for (int i = 0; i < inputChars.length; i++) 
        {
            inputChars[i] += 3;
        }
        
        String output = new String(inputChars);
        
        System.out.println("Original String: " + input);
        System.out.println("New String: " + output);
    }
    
}