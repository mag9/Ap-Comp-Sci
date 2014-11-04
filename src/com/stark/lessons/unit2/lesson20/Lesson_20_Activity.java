package com.stark.lessons.unit2.lesson20;

import java.util.Scanner;
import java.lang.Math; 

public class Lesson_20_Activity {
    public static void main(String[] args) {
      
          Scanner scan = new Scanner (System.in);

          System.out.println("Please enter the latitude.");
          double mostlat = scan.nextDouble();
          double leastlat = mostlat;
          System.out.println("Please enter the longitude.");
          double mostlong = scan.nextDouble();
          double leastlong = mostlong;
          System.out.println("Would you like to enter another location? Type 1 for yes or 0 for no.");
          int more = scan.nextInt();
          
          
        while (more == 1)
          {   
            System.out.println("Please enter the latitude.");
            double lattemp = scan.nextDouble();
               if ((lattemp > mostlat) && (lattemp >= -90) && (lattemp <= 90))
                 mostlat = lattemp;
               else if ((lattemp < leastlat) && (lattemp >= -90) && (lattemp <= 90))
                 leastlat = lattemp;
            System.out.println("Please enter the longitude.");
            double longtemp = scan.nextDouble();
               if ((longtemp > mostlong) && (longtemp >= -180) && (longtemp <= 180))
                 mostlong = longtemp;
               else if ((longtemp < leastlong) && (longtemp >= -180) && (longtemp <= 180))
                 leastlong = longtemp;
            if ((lattemp > 90) || (lattemp < -90) || (longtemp > 180) || (longtemp < -180))
            {
              System.out.println("Incorrect latitude or longitude.");
              more = 1;
            }
            else 
            {
              System.out.println("Would you like to enter another location?");
              more = scan.nextInt();
            }
           }
          
          System.out.println("Farthest North: " + mostlat);
          System.out.println("Farthest South: " + leastlat);
          System.out.println("Farthest East: " + mostlong);
          System.out.println("Farthest West: " + leastlong);
           
     }

}
