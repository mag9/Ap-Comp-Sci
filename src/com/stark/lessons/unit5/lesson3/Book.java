package com.stark.lessons.unit5.lesson3;

public class Book {

	String title;
	String author;
	int year;
	
	public Book(String t, String a, int y)
	{
		title = t;
		author = a;
		year = y;
	}
	
	public String toString()
	{
	
		return title + "\n" + author + "\n" + year;
	}
	
}
