package com.stark.lessons.unit5.lesson2;

import java.util.*;
import java.io.*;

public class MiniLab
{
    
    public static PrintStream ps = System.out;
    public static Scanner s = new Scanner(System.in);
    public static boolean running = true;
        
    //This is the Array that will hold majority of the work.
    public static ArrayList<String> al = new ArrayList();
    
    //The final modifyed Strings are dumped into this ArrayList.
    //this is the final ArrayList that will hold the correct Strings.
    public static ArrayList<String> alFinal = new ArrayList();
    
    //the character that determines what will be removed.
    public static char remChar;
    
    public static void main(String[] args)
	{
            
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
                
                //Removes the "STOP" String from the ArrayList
                al.remove("STOP");
                ps.println("");

                ps.println("Enter a character to remove all words in the ArrayList beginning with this letter:");
                remChar = s.next().charAt(0);
                
                remove(al, remChar);
	}
    
        public static void remove(ArrayList<String> arList, char a)
        {
            char upperA = Character.toUpperCase(a);
            
            Iterator<String> iter = arList.iterator();
            
            while(iter.hasNext())
            {
                String str = iter.next();
            
                if(str.charAt(0) == a || str.charAt(0) == upperA)
                {
                    iter.remove();
                }
            }
            
            ps.println();
            
            caps();
        }
        
        public static void caps()
        {   
            Iterator<String> iter = al.iterator();
            
            while(iter.hasNext())
            {
                String str = iter.next();
            
                String newCaps = str.substring(0).toUpperCase();
                String newCapsFinal = newCaps.charAt(0) + str.substring(1);
                
                str = newCapsFinal;
                
                alFinal.add(str);
                
                ps.println(str);
            }
            
            ps.println();
            ps.println(randomElement(al));
        }
        
        public static String randomElement (ArrayList<String> asdf)
        {
            //It pretty much just returns a random element from the final ArrayList
            
            String tbd = null;
            
            final int min = 0;
            final int max = asdf.size() - 1;
            final int range = (max + 1)-min;
            int rand = (int)(java.lang.Math.random() * (range)) + min;
            
            tbd = asdf.get(rand);
            
            return tbd + " The Wizard: Saves The World!" + "\n" + "\t" + "in 3D!";
        }
}