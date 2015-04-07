package com.stark.lessons.unit7.lesson17;

class Lesson_17_Activity 
{
    
    /*
     * Returns true if the array a is in ascending order and false otherwise.
     */
    public static boolean isSorted(int [] a)
    {
        boolean sorted = false;
        int[] aSorted = a;
        
        for (int j = 1; j < aSorted.length; j++) 
        {
            int key = aSorted[j];
            int i = j-1;
            
            while ((i > -1) && (aSorted[i] > key)) 
            {
              aSorted[i+1] = aSorted[i];
              i--;
            }
            
            aSorted[i+1] = key;
        }
        
        for(int i = 0; i < a.length; i++)
        {
            if(aSorted[i] == a[i])
            {
                sorted = true;
            }
            
            if(aSorted[i] != a[i])
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
