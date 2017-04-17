package headfirst.factory.pizzas;

public class PizzaClient {
  public static void main(String[] args){
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    
    Pizza pizza = store.orderPizza("cheese");
    System.out.println("\nWe ordered a " + pizza.getName() + "\n\n\n");
    //System.out.println(pizza.toString());
    
    pizza = store.orderPizza("pepperoni");
    System.out.println("\nWe ordered a " + pizza.getName() + "\n\n\n");
    //System.out.println(pizza.toString());
    
    pizza = store.orderPizza("veggie");
    System.out.println("\nWe ordered a " + pizza.getName() + "\n\n\n");
    //System.out.println(pizza.toString());
    
    pizza = store.orderPizza("potato");
    System.out.println("\nWe ordered a " + pizza.getName() + "\n\n\n");
    //System.out.println(pizza.toString());
    
  }
}