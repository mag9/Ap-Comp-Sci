package com.stark.lessons.unit5.lesson2;

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
                
                al.remove("STOP");
                ps.println("");
                
                for(String f: al)
                {
                    if(f.contains("a"))
                    {
                        ps.println(f);
                    }
                }
    }
}