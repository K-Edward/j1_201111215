package headfirst.strategy;

public class DecoyDuck extends Duck{
  public DecoyDuck(){
    flyBehavior = new FlyNoWays();
    quackBehavior = new MuteQuack();
  }
  
  public void display(){
    System.out.println("I'm a decoy duck'_'");
  }

}