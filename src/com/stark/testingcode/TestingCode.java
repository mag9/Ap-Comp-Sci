package com.stark.testingcode;

import java.awt.AWTException;

public class TestingCode
{
    private static final String ostype = System.getProperty("os.name").toLowerCase();

    public static void main (String[] args) throws AWTException
    {
    	if(ostype.startsWith("mac"))
        {
            System.out.println("Mac bro");
        }
        
        if(ostype.contains("win"))
        {
            System.out.println("Win bro");
        }
    }
}