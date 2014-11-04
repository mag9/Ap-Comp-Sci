package com.stark.assignments.TweetTester;

import java.util.*;
import java.io.*;
 
public class TweetTester_NonOOP 
{
     
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        PrintStream ps = System.out;
        String tweet; //the user's tweet
        int hashNum = 0; //The number of hashtags
        int attNum = 0; //the number of Attributions
        int linkNum = 0; //the number of links
        int excessNum = 0; //the amount of characters left in the tweet out of 140
        String link = "http://";
        String lowerCaseTweet;
        String correct = null;
         
        ps.println("Please enter a tweet: ");
        tweet = s.nextLine();
        lowerCaseTweet = tweet.toLowerCase();
         
        if(tweet.length() > 140)
        {
            ps.println("Excess Characters: " + (tweet.length() - 140));
            
        }        
         
        if(tweet.length() < 140)
        {
            correct = "Length Correct";
        }
         
        for(int i = 0; i < tweet.length() - 1; i++)
        {
            char charTest = tweet.charAt(i);
             
            if(tweet.charAt(i + 1) != ' ' && tweet.charAt(i + 1) != '\t' )
            {
                if(charTest == '#')
                {
                    hashNum++;
                }
            }
             
            if(tweet.charAt(i + 1) != ' ' && tweet.charAt(i + 1) != '\t' )
            {
                if(charTest == '@')
                {
                    attNum++;
                }
            }
        }
         
        int index = lowerCaseTweet.indexOf("http://");
        while(index != -1)
        {
                linkNum++;
                lowerCaseTweet = lowerCaseTweet.substring(index + 1);
                index = lowerCaseTweet.indexOf("http://");
           
        }
         
        ps.println(correct);
        ps.println("Number of Hashtags: " + hashNum);
        ps.println("Number of Attributions: " + attNum);
        ps.println("Number of Links: " + linkNum);
    }
     
}
