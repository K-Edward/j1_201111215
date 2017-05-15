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
//    } //띄우자마자 Instance를 만들기때문에 이 조건문은 의미가 없음.
    System.out.println("returning..");
    System.out.println("num called.." + numCalled++);
    return uniqueInstance;
  }
  
  
  
  
}