package headfirst.singleton.dcl;

public class Singleton {
  private volatile static Singleton uniqueInstance; //volatile �� thread�� ������ �ִ� ���� ���� �ٸ� thread�� �˰� �Ϸ���
  //������ ����
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

