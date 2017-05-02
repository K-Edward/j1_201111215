package headfirst.factory.pizzaaf.small;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyS = new NYPizzaStore();
        PizzaStore ccS = new ChicagoPizzaStore();
 
        Pizza pizza = nyS.orderPizza("cheese");
        System.out.println("1ST ORDER\n" + pizza + "\n");
        
        pizza = ccS.orderPizza("cheese");
        System.out.println("2ND ORDER\n" + pizza + "\n");
 }
}