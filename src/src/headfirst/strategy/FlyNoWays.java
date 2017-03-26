package headfirst.strategy;

public class FlyNoWays implements FlyBehavior {
  public void fly() {
    System.out.println("I can't fly....");
  }
}