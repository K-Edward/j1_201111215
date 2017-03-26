package headfirst.strategy;

public class MiniDuckSimulator1 {
  
  public static void main(String[] args) {
    
    Duck mallard = new MallardDuck();
    mallard.display();
    mallard.performQuack();
    mallard.performFly();
    System.out.println("");
    
    
    
    Duck model = new ModelDuck();
    model.display();
    model.performQuack();
    //model.performFly();
    //model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
    System.out.println("");

    Duck redhead = new RedHeadDuck();
    redhead.display();
    redhead.performQuack();
    redhead.performFly();
    System.out.println("");
    
    Duck rubber = new RubberDuck();
    rubber.display();
    rubber.performQuack();
    rubber.performFly();
    System.out.println("");
    
  }
}