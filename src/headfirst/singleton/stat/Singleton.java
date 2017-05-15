package headfirst.singleton.stat;

public class Singleton {
  //private static Singleton uniqueInstance;
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled = 0;
  
  
  private Singleton(){
    
  }
  
  public static Singleton getInstance(){
//    if(uniqueInstance == null){
//      System.out.println("createing..");
//      uniqueInstance = new Singleton();
//    } //����ڸ��� Instance�� ����⶧���� �� ���ǹ��� �ǹ̰� ����.
    System.out.println("returning..");
    System.out.println("num called.." + numCalled++);
    return uniqueInstance;
  }
  
  
  
  
}