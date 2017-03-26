package headfirst.strategy;

public class RubberDuck extends Duck {
  public RubberDuck(){
    flyBehavior = new FlyNoWays();
    quackBehavior = new Quack();
  }
  
  public void display(){
    System.out.println("I'm a rubber duck:)");
  }
  
}