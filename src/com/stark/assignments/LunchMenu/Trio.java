package com.stark.assignments.LunchMenu;

//<insert your Trio Class here>
// Need opening bracket, not closing bracket

public class Trio implements MenuItem
{
  private final Sandwich sandwich;
  private final Salad salad;
  private final Drink drink;
  
  public Trio(Sandwich sandwich, Salad salad, Drink drink)
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
  public double getPrice()
  {
    double price1   = sandwich.getPrice();
    double price2   = salad.getPrice();
    double price3   = drink.getPrice();
    double smallest = Math.min(Math.min(price1, price2), price3);
    
    return price1 + price2 + price3 - smallest;
  }

//toString to test the outputs- Should NOT be a part of your solution!  
  public String toString()
  {
    String name = getName();
    double price = getPrice();
    return name + " $" + price;
  }
    
  
  
  /**************************************
    *         TESTING TRIO CLASS
  **************************************/
  
  public static void main(String arg[])
  {
    //TEST CASE 1
    System.out.println("\nTEST CASE 1:");
    Sandwich s1 = new Sandwich("Cheeseburger", 3.75);
    System.out.println(s1);
    
    Salad salad1 = new Salad ("Spinach Salad", 1.25);
    System.out.println(salad1);
    
    Drink d1 = new Drink ("Soda", 1.25);
    System.out.println(d1);
    
    Trio t1 = new Trio (s1, salad1, d1);
    System.out.println(t1);
    if (t1.toString().equals("Cheeseburger/Spinach Salad/Soda Trio $5.0"))
    {
      System.out.println("TEST CASE 1 PASSES");
    }
    else
    {
      System.out.println("TEST CASE 1 FAILS");
    }
   
    
    //TEST CASE 2
    System.out.println("\nTEST CASE 2:");
    Sandwich s2 = new Sandwich("Club Sandwich", 2.75);
    System.out.println(s2);
    
    Salad salad2 = new Salad ("Coleslaw", 1.25);
    System.out.println(salad2);
    
    Drink d2 = new Drink ("Cappuccino", 3.50);
    System.out.println(d2);
    
    Trio t2 = new Trio (s2, salad2, d2);
    System.out.println(t2);
    if (t2.toString().equals("Club Sandwich/Coleslaw/Cappuccino Trio $6.25"))
    {
      System.out.println("TEST CASE 2 PASSES");
    }
    else
    {
      System.out.println("TEST CASE 2 FAILS");
    }
    
    
    //TEST CASE 3
    System.out.println("\nTEST CASE TRIO 3:");
    
    Trio t3 = new Trio (s1, salad1, d2);
    System.out.println(t3);
    if (t3.toString().equals("Cheeseburger/Spinach Salad/Cappuccino Trio $7.25"))
    {
      System.out.println("TEST CASE 3 PASSES");
    }
    else
    {
      System.out.println("TEST CASE 3 FAILS");
    }
    
  }
}
