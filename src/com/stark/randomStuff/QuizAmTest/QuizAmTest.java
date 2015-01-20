package com.stark.randomStuff.QuizAmTest;

import java.io.PrintStream;
import java.util.Scanner;

public class QuizAmTest {

	public static PrintStream ps = System.out;
	public static Scanner s = new Scanner(System.in);
	
	public static String name;
	
	public static boolean farfar37;
	public static boolean running = true;
	
	public static String[] facts = new String[] 
	{
		"A crocodile can't stick it's tongue out!", 
		"A pregnant goldfish is called a twit!",
		"Rats and horses can't vomit!",
		"A ball of glass will bounce higher than a ball of rubber!",
		"A ball of solid steel will bounce higher than one made entirely of glass.",
		"Guinea pigs and rabbits can't sweat!"
	};
	
	public static boolean randomize()
	{
		final int min = 0;
		final int max = 100;
		final int range = (max + 1)-min;
	    int rand = (int)(java.lang.Math.random() * (range)) + min;
		
	    if(rand > 50 && rand < 100)
	    {
	    	//If the the random number is greater than 50, than there is a quizam
	    	farfar37 = true;
	    }
	    
	    if(rand < 50 && rand > 0)
	    {
	    	//If the random number is less than 50, then there is no quizam
	    	farfar37 = false;
	    }
	    
	    return farfar37;
	    //I realize that this return is pointless and I could just use a void method
	    //I left as a boolean so I can switch it back to testing faster if I need to show testing stuff.
	    //As in prove that it is 50/50 cause it doesn't feel like it, but it is.
	}
	
	public static void quizam()
	{
		/*while(running)
		{
			ps.println(randomize());
		}*/
		
		final int min = 0;
		final int max = 5;
		final int range = (max + 1)-min;
	    int rand = (int)(java.lang.Math.random() * (range)) + min;
		
		if(farfar37 = true)
		{
			ps.println(facts[rand]);
			ps.println("also, " + name + " there is a quizam");
		}
		
		if(farfar37 = false)
		{
			ps.println(facts[rand]);
			ps.println("also, " + name+ " there is no quizam");
		}
	}
	
	public static void main(String[] spanky)
	{
		ps.println("Hello! Please enter your name and press return!");
		name = s.nextLine();
		quizam();
	}
	
}
