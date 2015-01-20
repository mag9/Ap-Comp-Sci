package com.stark.assignments.BinaryConverter;

import java.util.Scanner;

public class BinaryConverter 
{
	public static String prompt = "Enter a base ten number between 0 and 255, inclusive.";
	
	public static int firstNum, secondNum;
	
	public static int[] binaryOne;
	public static int[] binaryTwo;
	
	public static int[] finalBinary = new int[8];

	private static Scanner s;
	
	public static int[] convertToBinary(int b)
	{
		int[] localBinary = new int[8];
	
        int index = 0;
        while(b > 0){
        	localBinary[index++] = b%2;
            b = b/2;
        }
        
        
        for(int i = 0; i < localBinary.length / 2; i++)
        {
        	int temp = localBinary[i];
        	localBinary[i] = localBinary[localBinary.length - i - 1];
        	localBinary[localBinary.length - i - 1] = temp;
        }
        
		return localBinary;
	}
	
	public static void printBin(int b[])
	{
		if(b == binaryOne)
			System.out.println("First binary number: ");
		
		if(b == binaryTwo)
			System.out.println("Second binary number: ");
		
		for(int i = 0; i < b.length; i++)
		{
			System.out.print(b[i] + " ");
		}
	}
	
	public static int[] addBin(int a[], int b[])
	{
		System.out.println("Added:");
		
		int finalBinaryNum = firstNum + secondNum;
		finalBinary = convertToBinary(finalBinaryNum);
		
		for(int i = 0; i < finalBinary.length; i++)
		{
			System.out.print(finalBinary[i] + " ");
		}
		
		return finalBinary;
	}
	
	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		
		System.out.println(prompt);
		firstNum = s.nextInt();
		binaryOne = convertToBinary(firstNum);
		
		System.out.println(prompt);
		secondNum = s.nextInt();
		binaryTwo = convertToBinary(secondNum);
		System.out.println("");
		
		printBin(binaryOne);
		System.out.println("\n");
		printBin(binaryTwo);
		System.out.println("\n");
		
		addBin(binaryOne, binaryTwo);
	}
	
}