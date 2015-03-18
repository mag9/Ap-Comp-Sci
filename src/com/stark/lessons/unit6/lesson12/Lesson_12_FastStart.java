package com.stark.lessons.unit6.lesson12;

import java.util.ArrayList;

public class Lesson_12_FastStart
{


     public static void main (String str[]) 
     {
       ArrayList <String> list = new ArrayList <String>();
       
       list.add("yo");
       list.add("po");
       list.add("ko");
       list.add("ho");
       list.add("jo");
       list.add("fo");
       list.add("mo");
       list.add("no");
       list.add("bo");
       list.add("co");
       
       int randStr1 = (int)(Math.random()*10);
       int randStr2 = (int)(Math.random()*10);
       
       while (randStr1 == randStr2)
         randStr1 = (int)(Math.random()*10);
       
       System.out.println(list.get(randStr1));
       System.out.println(list.get(randStr2));
     }
}