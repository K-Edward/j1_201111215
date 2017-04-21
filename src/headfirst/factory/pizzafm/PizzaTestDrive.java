package headfirst.factory.pizzafm;

public class PizzaTestDrive{
  public static void main(String[] args){
    PizzaStore ny_Store = new NYPizzaStore();
    PizzaStore sm_Store = new SMPizzaStore();
    
    Pizza pizza = ny_Store.orderPizza("potato");
    System.out.println("\n1st Client ordered a " + pizza.getName() + "\n");
    
    pizza = sm_Store.orderPizza("great_hill");
    System.out.println("\n2nd Client ordered a " + pizza.getName() + "\n");
    
    
  }
}