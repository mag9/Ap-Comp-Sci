package com.stark.misc.Die_Class;

public class Die_runner {
    
    public static void main(String[] args)
    {
        Die die = new Die();
        
        System.out.println(die);
        
        die.setValue(40);
        
        System.out.println("\n");
        
        System.out.println(die);
    }
    
}
