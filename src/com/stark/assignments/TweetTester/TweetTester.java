package com.stark.assignments.TweetTester;

import java.util.*;
import java.io.*;

public class TweetTester 
{
	
	public static Scanner s = new Scanner(System.in);
	public static PrintStream ps = new PrintStream(System.out);
	public static String tweet; //the user's tweet
	public static int hashNum = 0; //The number of hashtags
	public static int attNum = 0; //the number of Attributions
	public static int linkNum = 0; //the number of links
	public static int excessNum; //the amount of characters left in the tweet out of 140
	public static String link = "http://";
	
	public static void input()
	{
		ps.println("Please enter a tweet: ");
		tweet = s.nextLine();
	}
	
	public static void lengthCheck()
	{
		if(tweet.length() > 140)
		{
			ps.println("Excess Characters: " + (tweet.length() - 140));
			System.exit(0);
		}
	}
	
	public static void tweetDetection()
	{	
		for(int i = 0; i < tweet.length(); i++)
		{
			char charTest = tweet.charAt(i);
			
			if(charTest == '#')
			{
				hashNum++;
			}
			
			if(charTest == '@')
			{
				attNum++;
			}
		}
		
		int index = tweet.indexOf("http://");
		while(index != -1)
		{
			linkNum++;
			tweet = tweet.substring(index + 1);
			index = tweet.indexOf("http://");
		}
	}
	
	public static void output()
	{
		ps.println("Numer of Hastags: " + hashNum);
		ps.println("Numer of Attributions: " + attNum);
		ps.println("Numer of Links: " + linkNum);
		ps.println("Excess Characters: " + excessNum);
		ps.println("Tweet length: " + tweet.length());
	}
	
	public static void main(String[] args)
	{
		input();
		lengthCheck();
		tweetDetection();
		output();
	}
	
}
