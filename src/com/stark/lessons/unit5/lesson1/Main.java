package com.stark.lessons.unit5.lesson1;

import java.util.*;
import java.io.*;

public class Main 
{	
	public static void main(String[] args)
	{
            PrintStream ps = System.out;
            Scanner s = new Scanner(System.in);
            boolean running = true;
        
            ArrayList<String> al = new ArrayList();
            
		ps.println("Please enter words, enter STOP to stop the loop.");
                
                loop:
                while(running)
                {
                    al.add(s.next());
                    
                    if(al.contains("STOP"))
                    {
                        break loop;
                    }
                }
                
                al.remove("STOP");      //Removes the STOP String
                ps.println("");
                ps.println(al.size());  //Prints ArrayList size
                ps.println(al);         //prints ArrayList al
                
                if(al.size() > 2)
                {
                    al.remove(al.get(0));
                    al.remove(al.size() - 1);
                }
                
                ps.println(al);
	}
}