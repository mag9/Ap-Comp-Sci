package com.stark.assignments.Bitmap;

public class Bitmap
{
    //A 10x10 two-dimensional array of Strings to hold the symbols.
    private final String image[][] = new String[10][10];
    
    public Bitmap(int a[])
    {
        for(int i = 0; i < image.length; i++)
        {
            for(int j = 0; j < image[0].length; j++)
            {
                if(i == a[i])
                {
                    if(j == a[j])
                    {
                        image[i][j] = "*";
                    } else {
                        image[i][j] = "-";
                    }
                }
            }
        }
    }
    
    //The "*" symbols in the array are flipped horizontally, or in others words, from left to right.
    public void flipHorizontal()
    {
        
    }
    
    //The "*" symbols in the array are flipped vertically, or in other words, from top to bottom.
    public void flipVertical()
    {
        
    }
    
    //Changes the "-" symbols to "*" symbols, and vice versa.
    public void reverse()
    {
        
    }
    
    //Returns a multiline String representing the image.
    public String toString()
    {
        for(int i = 0; i < image.length; i++)
        {
            for(int j = 0; j < image[0].length; j++)
            {
                return image[i][j];
            }
        }
        
        return image[1][1];
    }
     
}
