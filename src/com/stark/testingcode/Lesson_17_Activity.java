package com.stark.testingcode;

class Lesson_17_Activity 
{
    
    /*
     * Returns true if the array a is in ascending order and false otherwise.
     */
    public static boolean isSorted(int [] a)
    {
        boolean sorted = false;
        
        for(int i = 1; i < a.length; i++)
        {
            if(a[i+1] == a[i])
            {
                sorted = true;
            }
            
            if(a[i+1] != a[i])
            {
                sorted = false;
            }
        }
        
        return sorted;
    }
    
    /*
     * Performs a binary search to determine if the value b is stored in a. 
     * If b is found, return the index of b. Otherwise, return -1.
     */
    public static int binarySearch(int [] a, int b)
    {
        int low = 0; 
        int high = a.length-1;
        int found = -1;
   
        while(low <= high && found == -1)
        {
            int mid = (low+high)/2;
            
            if(a[mid] == b)
            {
                found = mid;
                return found;
            }
            else if(a[mid] < b)
            {
                low = mid+1;
            }
            else if(a[mid] > b)
            {
                high = mid-1;
            }
        }
   
        return found;
    }
    
}
