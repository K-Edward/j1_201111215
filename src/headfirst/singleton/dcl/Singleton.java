package headfirst.singleton.dcl;

public class Singleton {
  private volatile static Singleton uniqueInstance; //volatile 은 thread가 가지고 있는 변수 값을 다른 thread도 알게 하려면
  //공유의 개념
  //private static Singleton uniqueInstance = new Singleton();
  private static int numCalled = 0;
  
  private Singleton(){
    
  }
  
  //public static synchronized Singleton getInstance(){
  public static Singleton getInstance(){
    if(uniqueInstance == null){
      synchronized(Singleton.class) {
        if(uniqueInstance == null){
          System.out.println("createing..");
          uniqueInstance = new Singleton();
        }
      }
    } 
    System.out.println("returning..");
    System.out.println("num called.." + numCalled++);
    return uniqueInstance;
  }
  
  
    
    
}

