package headfirst.singleton.chocolate;

public class ChocolateBoiler {
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled = 0;
  
  private boolean empty;
  private boolean boiled;
  
  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  }
  
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance == null){
      System.out.println("createing..");
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("returning..");
    System.out.println("num called.." + numCalled++);
    return uniqueInstance;
  }
  
  public void fill(){
    if(isEmpty()){
      System.out.println("filling..");
      empty = false;
      boiled = false;
    }
  }
  
  public boolean isEmpty(){
    return empty;
  }
}