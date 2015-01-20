package com.stark.misc.Die_Class;

public final class Die 
{
    //The number of sides that he die has.
    int numSides;
    
    //the value of the number that is rolled from the die.
    int value;
    
    public Die()
    {
        //default sides if if it is just called.
        numSides = 6;
        
        //calls to roll the die with nothing entered.
        roll();
    }
    
    public void setValue(int sides)
    {
        /*
            if the value is not greater than or equal to 4 
            then the number of sides is set to 4 by default.
        */
        numSides = 4;
        
        if( numSides >= 4)
        {
            //numSides is set to the value passed when setValue is caled
            numSides = sides;
        }
        
        roll();
    }
    
    public Die(int sides)
    {
        numSides = 4;
        if(sides >= 4)
        {
           numSides = sides;
        }
        
        roll();
    }
    
    public void roll()
    {
        value = (int)(Math.random() * numSides + 1);
    }
    
    @Override
    public String toString()
    {
        return "Number of Sides: " + numSides + "\n" + "Random Value: " + value;
    }
}
