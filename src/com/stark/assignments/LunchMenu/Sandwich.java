package com.stark.assignments.LunchMenu;

public class Sandwich implements MenuItem
{
  private String sandwich;
  private double sandwichCost;
  public Sandwich (String s, double c)
  {
    sandwich = s;
    sandwichCost = c;
  }
  
  public String getName()
  {
    return sandwich;
  }
  
  public double getPrice()
  {
    return sandwichCost;
  }
  public String toString()
  {
    return sandwich + " $" + sandwichCost;
  }
}