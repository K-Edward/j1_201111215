package headfirst.factory.pizzaaf.small;

public class CheesePizza extends Pizza{
  PizzaIngredientFactory inFac;
  
  public CheesePizza(PizzaIngredientFactory ingredientFac){
    this.inFac = ingredientFac;
  }
  
  public void prepare(){
    System.out.println("Preparing " + name);
    dough = inFac.createDough();
    cheese = inFac.createCheese();
  }
}