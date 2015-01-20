package com.stark.assignments.WildCard;

import java.util.Scanner;

// Import System.out so we can just use "out"
import static java.lang.System.out;

public class WildCar_Other
{

    /**
     * The main method.
     * @param args The command line arguments.
     */
    public static void main(String[] args)
    {
        // Create a new instance of the WildCard class.
        WildCar_Other application = new WildCar_Other();
        
        // Prompt the user for input
        application.promptForInput();
    }
    
    /**
     * Prompt the user for input.
     */
    public void promptForInput()
    {
        // Create a new Scanner from the System input.
        Scanner scanner = new Scanner(System.in);
        
        // the final result String
        String result = null;
        
        // Prompt the user for the first string
        out.print("Please enter the first String: ");
        final String first = scanner.nextLine();
        
        // Prompt the user for the second string
        out.print("Please enter the replacement String: ");
        final String second = scanner.nextLine();
        
        if(!first.contains("*"))
		{	
			out.println("Error: no *");
			return;
		} 

        if(!(first.toLowerCase().equals(first.toUpperCase())) && first.contains("*"))
        {
        		result = first.replace("*", second);
        		out.println(result);
        		return;
        } 
        
        if(!(first.toLowerCase().equals(first.toUpperCase())) && !(first.contains("*")));
        {
        	if(!first.contains("*"))
        	{
        		out.println("Error: Incorrect characters");
        		return;
        	}
        } 
    }
}
