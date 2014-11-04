package com.stark.lessons.unit2.lesson20;

import java.util.*;
import java.io.*;

public class Lesson_20_Activity_Good
{

	public static PrintStream ps = System.out;
	public static Scanner s = new Scanner(System.in);
	
	public static ArrayList<Double> longi = new ArrayList<Double>();
	public static ArrayList<Double> lat = new ArrayList<Double>();
	public static int arrayNumLong = 0;
	public static int arrayNumLat = 0;
	public static int runAgain;
	
	public static void userIn()
	{
		ps.println("Please enter the latitude: ");
		lat.add(arrayNumLat, s.nextDouble());
		arrayNumLat++;
		
			for(int la = 0; la < lat.size(); la++){
				if(lat.indexOf(la) < -90 || lat.indexOf(la) > 90)
				{
					lat.remove(la);
				}
			}
		
		ps.println("Please enter the longitude: ");
		longi.add(arrayNumLong, s.nextDouble());
		arrayNumLong++;
		
			for(int li = 0; li < longi.size(); li++){
				if(longi.indexOf(li) < -90 || longi.indexOf(li) > 90)
				{
					longi.remove(li);
				}
			}
		
		ps.println("Would you like to enter another location?");
		runAgain = s.nextInt();
		if(runAgain == 1){
			userIn();
		} else if(runAgain == 0){
			output();
		}
	}
	
	public static void output()
	{
		    System.out.println("Farthest North: " + Collections.max(lat));
		    System.out.println("Farthest South: " + Collections.min(lat));
		    System.out.println("Farthest East: " + Collections.max(longi));
		    System.out.println("Farthest West: " + Collections.min(longi));
	}
	
	public static void main(String[] args)
	{
		userIn();
	}
	
}
