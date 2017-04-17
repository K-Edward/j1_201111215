package headfirst.factory.pizzas;

public class PotatoPizza extends Pizza{
  public PotatoPizza(){
    name = "Potato Pizza";
    dough = "Regular Crust";
    sauce = "Sweet Pizza Sauce";
    toppings.add("Sliced Potato");
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmessan");
  }
}