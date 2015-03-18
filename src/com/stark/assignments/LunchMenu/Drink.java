package com.stark.assignments.LunchMenu;

public class Drink implements MenuItem
{
  private String drink;
  private double drinkCost;
  public Drink (String d, double c)
  {
    drink = d;
    drinkCost = c;
  }
  
  public String getName()
  {
    return drink;
  }
  
  public double getPrice()
  {
    return drinkCost;
  }
  public String toString()
  {
    return drink + " $" + drinkCost;
  }
}