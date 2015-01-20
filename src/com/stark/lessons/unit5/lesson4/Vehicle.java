package com.stark.lessons.unit5.lesson4;

public class Vehicle {

    private int location;

    public Vehicle () 
    {
        location = 0;
    }

    public Vehicle (int loc) 
    {
        if (-20 <= loc && loc <= 20)
            location = loc;
        else
            location = 0;
    }

    public void forward() 
    {
        if (location <= 19)
            location++;
    }

    public void backward() 
    {
        if (location >= 1)
            location--;
    }

    public int getLocation() 
    {
        return location;
    }

    public String toString() 
    {

        String w = "";
        int x = -20;
    
        if (location == -20)
            return "@";
        else
        {
            while (x < location)
            {
                w += " ";
                x++;
            }
            
            return w + "@";
        }
    }
}
