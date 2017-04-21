package headfirst.factory.pizzafm;

public class NYStylePotatoPizza extends Pizza{
  public NYStylePotatoPizza(){
    name = "NY Style Sauce and Potato Pizza";
    dough = "Regular Crust";
    sauce = "Sweet Pizza Sauce";
    toppings.add("Sweet Cheese");
    toppings.add("Sliced Potatoes");
  }
}