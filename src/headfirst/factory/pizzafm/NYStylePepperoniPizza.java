package headfirst.factory.pizzafm;

public class NYStylePepperoniPizza extends Pizza{
  public NYStylePepperoniPizza(){
    name = "NY Style Sauce and Pepperoni Pizza";
    dough = "Thin Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Grated Reggiano Cheese");
    toppings.add("Sliced Bacon");
    toppings.add("Ham");
  }
}