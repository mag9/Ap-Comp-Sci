package com.stark.assignments.Elevens.Activity_One;

public class Card 
{
 private String suit;
 private String rank;
 private int pointValue;

 public Card(String cardRank, String cardSuit, int cardPointValue) 
 {
   rank = cardRank;
   suit = cardSuit;
   pointValue = cardPointValue;
 }

 public String suit() 
 {
   return suit;
 }

 public String rank() 
 {
   return rank;
 }

 public int pointValue() 
 {
   return pointValue;
 }

 public boolean matches(Card otherCard)
 {
   if(rank.compareTo(otherCard.rank) == 0)
   {
     if(suit.compareTo(otherCard.suit) == 0)
     {
       if(pointValue == otherCard.pointValue)
       { 
         return true;
       }
     }
   }
   return false;
 }

 @Override
 public String toString()
 {
   String card = "";
   
   rank =  rank.substring(0, 1).toUpperCase() + rank.substring(1);
   card += rank;
   
   card += " of ";
   
   suit = suit.substring(0, 1).toUpperCase() + rank.substring(1);
   card += suit;

   card += " point value = ";
   card += pointValue;
   return card;
 }
}
