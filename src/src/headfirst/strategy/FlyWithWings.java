package headfirst.strategy;

public class FlyWithWings implements FlyBehavior {
  public void fly() {
    System.out.println("I'm flying!!"); //실제로 날아가는걸 프로그래밍하지는 않고 print문 사용
  }
}