package headfirst.factory.pizzas;

public class PizzaStore{
  SimplePizzaFactory factory = null;
  
  public PizzaStore(SimplePizzaFactory factory){
    this.factory = factory;
  }
  
  public Pizza orderPizza(String type){
    Pizza pizza;
    pizza = factory.createPizza(type); //이 줄이 factory의 특징을 보여주는 line
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    
    return pizza;
  }  
}