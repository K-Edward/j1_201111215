package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore{
  //이때 가시성은 package private
  Pizza createPizza(String type){
    Pizza pizza = null;
    
    if(type.equals("cheese")){
      pizza = new NYStyleCheesePizza();
    }
    else if(type.equals("pepperoni")){
      pizza = new NYStylePepperoniPizza();
    }
//    else if(type.equals("veggie")){
//      pizza = new VeggiePizza();
//    }
//    else if(type.equals("potato")){
//      pizza = new PotatoPizza();
//    }
    
    return pizza;
  }
}