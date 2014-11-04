package com.stark.lessonseven;

import java.util.Scanner;

class Lesson_7_Activity {
    public static void main(String[] args) {

        // #1
      System.out.println("Please enter a three digit number:");
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt();
      System.out.println(((x % 1000) - (x % 100))/100);
      System.out.println(((x % 100) - (x % 10))/10);
      System.out.println(x % 10);
      
        /*#2
      System.out.println("Please enter a three digit number:");
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt();
      System.out.println("Here are the digits:");
      int x100 = ((x % 1000) - (x % 100))/100;
      System.out.println(x100);
      int x10 = ((x % 100) - (x % 10))/10;
      System.out.println(x10);
      int x1 = x % 10;
      System.out.println(x1);
      System.out.println("\n" + x100 + " + " + x10 + " + " + x1 + " = " + (x100 + x10 + x1));
      */
      
        }
}