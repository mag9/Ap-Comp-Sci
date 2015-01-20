package com.stark.lessons.unit5.lesson3;

import java.io.*;
import java.util.*;

public class Main {

	public static PrintStream ps = System.out;
	
	public static void main(String[] args)
	{
		Book b = new Book("Steve Jobs", "ASDF", 1935);
		
		ps.println(b);
	}
	
}
