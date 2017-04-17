package headfirst.factory.pizzas;

public class VeggiePizza extends Pizza{
  public VeggiePizza(){
    name = "Veggie Pizza";
    dough = "Thin Crust";
    sauce = "Fresh Sauce";
    toppings.add("Fresh vegetable");
    toppings.add("Parmessan");
  }
}