package com.stark.assignments.InsertNames;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    static Main m = new Main();
    private ArrayList finalNames = new ArrayList();
    
    public void sortArray(ArrayList names)
    {
        String [] namesArray = (String[]) names.toArray(new String[names.size()]);
        
        //Insertion sort
        for (int j = 1; j < namesArray.length; j++) 
        {
            String key = namesArray[j];
            int i = j - 1;
            
            while (i >= 0)
            {
                if (key.compareTo(namesArray[i]) > 0) 
                {
                  break;
                }
              
                namesArray[i + 1] = namesArray[i];
                i--;
            }
            
            namesArray[i + 1] = key;
        }
        
        //Put sorted array back into a final ArrayList
        for(String namesArrayName : namesArray)
        {
            namesArrayName = titleCase(namesArrayName);
            finalNames.add(namesArrayName);
        }
        
        System.out.println(finalNames);
    }
    
    public String titleCase(String s)
    {
        String output = s.substring(0, 1).toUpperCase() + s.substring(1);
        s = output;
        
        return s;
    }
    
    public static void main (String[] args)
    {
        ArrayList names = new ArrayList();
        
        boolean inputName = true;
        
        Scanner s = new Scanner(System.in);
        
        while(inputName)
        {        
            System.out.println("Enter the next name:");

            //local name variable
            String name;

            //name is the users input
            name = s.nextLine();

            //name value but in lower case
            String lowerName = name.toLowerCase();

            //the name that the user entered is added to the names arraylist

            if("stop".equals(lowerName))
            {
                inputName = false; 
            } else {
                names.add(lowerName);
            }
        }

        //runs through arraylist
        for(int i = 0; i < names.size(); i++)
        {
            //  if the newly entered name is stop then it 
            //  removes it and calls the next method.
            if(names.get(i) == "stop")
            {
               names.remove(i);
               m.sortArray(names);
            }
        }
        
        m.sortArray(names);
    }
}
