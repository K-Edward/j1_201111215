package headfirst.factory.pizzas;

public class PizzaStore{
  SimplePizzaFactory factory = null;
  
  public PizzaStore(SimplePizzaFactory factory){
    this.factory = factory;
  }
  
  public Pizza orderPizza(String type){
    Pizza pizza;
    pizza = factory.createPizza(type); //�� ���� factory�� Ư¡�� �����ִ� line
    System.out.println(pizza.toString());
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    
    return pizza;
  }
}