package headfirst.factory.pizzaaf.small;

public class NYPizzaStore extends PizzaStore{
  Pizza createPizza(String type){
    Pizza pizza = null;
    NYPizzaIngredientFactory inFac = new NYPizzaIngredientFactory();
    
    if(type.equals("cheese")){
      pizza = new CheesePizza(inFac);
      pizza.setName("New York Style Cheese Pizza");
      
    }
    
    return pizza;
  }
}