package com.stark.assignments.LunchMenu;

public class Salad implements MenuItem
{
  private String salad;
  private double saladCost;
  public Salad (String s, double c)
  {
    salad = s;
    saladCost = c;
  }
  
  public String getName()
  {
    return salad;
  }
  
  public double getPrice()
  {
    return saladCost;
  }
  
  public String toString()
  {
    return salad + " $" + saladCost;
  }
}