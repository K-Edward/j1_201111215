package headfirst.factory.pizzas;

public class PepperoniPizza extends Pizza{
  public PepperoniPizza(){
    name = "Pepperoni Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Napoletava piccante(Ham)");
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmessan");
  }
}
