package headfirst.factory.pizzaaf.small;

public class PotatoPizza extends Pizza{
  PizzaIngredientFactory inFac;
  
  public PotatoPizza(PizzaIngredientFactory ingredient){
    this.inFac = ingredient;
  }
  
  public void prepare(){
    System.out.println("Preparing " + name);
    dough = inFac.createDough();
    potato = inFac.createPotato();
  }
}