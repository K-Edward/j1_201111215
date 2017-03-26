package headfirst.strategy;

public class MiniDuckSimulator1 {
  
  public static void main(String[] args) {
    
    Duck mallard = new MallardDuck();
    mallard.display(); //���� ��ü ����
    mallard.performQuack(); //������ ��� ���
    mallard.performFly(); //������ ���ư��� ���
    System.out.println("");
    
    
    
    Duck model = new ModelDuck();
    model.display();
    model.performQuack();
    //model.performFly();
    //model.setFlyBehavior(new FlyRocketPowered()); //���� FlyNoWays ���� ���ư��� ����� FlyRocketPowered�� �ٲ��ִ� �ڵ�
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