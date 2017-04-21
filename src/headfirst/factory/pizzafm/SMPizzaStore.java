package headfirst.factory.pizzafm;

public class SMPizzaStore extends PizzaStore{
  Pizza createPizza(String type){
    Pizza pizza = null;
    
    if(type.equals("cheese")){
      pizza = new SMStyleCheesePizza();
    }
    else if(type.equals("great_hill")){
      pizza = new SMStyleGreatHillPizza();
    }
    
    return pizza;
  }
}