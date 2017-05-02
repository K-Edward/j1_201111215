package headfirst.factory.pizzaaf.small;

public class ChicagoPizzaStore extends PizzaStore{
  protected Pizza createPizza(String item){
    Pizza pizza = null;
    PizzaIngredientFactory inFac = new ChicagoPizzaIngredientFactory();
    
    if(item.equals("cheese")){
      pizza = new CheesePizza(inFac);
      pizza.setName("Chicago Style Cheese Pizza");
    }
    else if(item.equals("potato")){
      pizza = new PotatoPizza(inFac);
      pizza.setName("Chicago Style Potato Pizza");
    }
    
    return pizza;
  }
}