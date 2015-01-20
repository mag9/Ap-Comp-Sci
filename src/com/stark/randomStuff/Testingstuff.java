package com.stark.randomStuff;

import java.io.PrintStream;
import java.util.*;

public class Testingstuff {
	
	public static PrintStream ps = System.out;
	
	public static Scanner s = new Scanner(System.in);
	
	public static boolean running = true;
	
	public static void main(String[] args)
	{
		int c = 0;
		
		while(running)
		{
			c += 1;
		}
		
		ps.println(c);
	}
	
}
