package com.stark.lessons.unit7.lesson15;

public class Lesson_15_Activity 
{
    public static void sortAndPrint(String [] list)
    {
        int j, k;

        for (j = list.length - 1; j > 0; j--)
        {
            int pos = j;
                
            for (k = j-1; k >= 0; k--)
            {
                if (list[k].compareTo(list[pos]) > 1)
                {
                    pos = k;
                }
            }
                
            String tmp = list[j];
                
            list[j] = list[pos];
            list[pos] = tmp;
        }
        
        for (String list1 : list)
        {
            System.out.print(list1 + " ");
        }
    }
}