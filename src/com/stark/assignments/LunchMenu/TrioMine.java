package com.stark.assignments.LunchMenu;

public class TrioMine implements MenuItem
{
  private final Sandwich sandwich;
  private final Salad salad;
  private final Drink drink;
  
  public TrioMine(Sandwich sandwich, Salad salad, Drink drink)
  {
    this.sandwich    =   sandwich;
    this.salad       =   salad;
    this.drink       =   drink;
  }
  
  /**
   * @return returns the name in the format "Sandwich/Salad/Drink Trio"
   */
  @Override
  public String getName()
  {
    return sandwich.getName() + "/" + salad.getName() +
                                "/" + drink.getName() + " Trio";
  }
  
    /**
     * @return returns the price of the meal minus the lowest amount.
     */
    @Override
  public double getPrice()
  {
    double price1   = sandwich.getPrice();
    double price2   = salad.getPrice();
    double price3   = drink.getPrice();
    double smallest = Math.min(Math.min(price1, price2), price3);
    
    return price1 + price2 + price3 - smallest;
  }
}