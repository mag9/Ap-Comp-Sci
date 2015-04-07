package com.stark.lessons.unit7.lesson15;

public class Lesson_15_Activity 
{
  
    public static void main(String[] args)
    {
        String [] list = {"against", "forms", "belief", "government", "democratic", "movement", "understanding"};
        int [] nums = {2, 4, 55, 23, 75, 1, 8, 89, 666, 216, 312, 540, 333, 19, 1242};

        sortAndPrint(list);
        System.out.println();
        sortAndPrint2(nums);
    }

    public static void swap (String [] a, int i, int j) 
    {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    //Selection.
    public static void sortAndPrint(String [] list)
    {
        for(int i = 0; i < list.length; i++)
        {
          for(int j = i+1; j < list.length; j++)
          {
            if(list[j].compareTo(list[i]) < 0)
            {
             swap(list, i, j);
            }
          }
        }

        for(int x = 0; x < list.length; x++)
        {
          System.out.print(list[x] + " ");
        }
    }  

    //Insertion.
    public static void sortAndPrint2(int arr[]) 
    {
        for (int i = 1; i < arr.length; i++) 
        {
            int key = arr[i];
            int j = i-1;
            
            while ((j > -1) && (arr[j] > key)) 
            {
              arr[j+1] = arr[j];
              j--;
            }
            
            arr[j+1] = key;
      }

        for(int x = 0; x < arr.length; x++)
        {
            System.out.print(arr[x] + " ");
        }
    }
}