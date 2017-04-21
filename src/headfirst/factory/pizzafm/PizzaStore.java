package headfirst.factory.pizzafm;

public abstract class PizzaStore{
  abstract Pizza createPizza(String item);
  
  public Pizza orderPizza(String type){
    Pizza pizza;
    //simple factory에서는 아래와 같이 썼었다.
    //pizza = factory.createPizza(type);
    pizza = createPizza(type);
    System.out.println(pizza.toString());
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    
    return pizza;
  }
}