package headfirst.strategy;

public class MallardDuck extends Duck {
  
  public MallardDuck() {
    //fb = new FlyWithWings(); //�Ʒ��� ��� �̷��� �ص� ��
    
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }
  
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}