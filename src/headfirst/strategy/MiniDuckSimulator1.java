package headfirst.strategy;

public class MiniDuckSimulator1 {
  
  public static void main(String[] args) {
    
    Duck mallard = new MallardDuck();
    mallard.display(); //오리 정체 밝힘
    mallard.performQuack(); //오리가 우는 방식
    mallard.performFly(); //오리가 날아가는 방식
    System.out.println("");
    
    
    
    Duck model = new ModelDuck();
    model.display();
    model.performQuack();
    //model.performFly();
    //model.setFlyBehavior(new FlyRocketPowered()); //원래 FlyNoWays 였던 날아가는 방식을 FlyRocketPowered로 바꿔주는 코드
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
    
    Duck decoy = new DecoyDuck();
    decoy.display();
    decoy.performQuack();
    decoy.performFly();
    System.out.println("");
    
    
    decoy.swim();
    
  }
}