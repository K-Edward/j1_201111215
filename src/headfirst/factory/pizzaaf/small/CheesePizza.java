package headfirst.factory.pizzaaf.small;

public class CheesePizza extends Pizza{
  PizzaIngredientFactory inFac;
  
  public CheesePizza(PizzaIngredientFactory ingredientFac){
    name = "NY Style Cheese Pizza";
    this.inFac = ingredientFac;
//    dough = "Thin Crust";
//    sauce = "Marinara Pizza Sauce";
//    toppings.add("Grated Reggiano Cheese");
  }
  
  void prepare(){
    dough = inFac.createDough();
    cheese = inFac.createCheese();
  }
}