package headfirst.singleton.chocolate1;

public class ChocolateBoiler {
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled=0;
  
  private boolean empty;
  private boolean boiled;
  
  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }
  
  public static synchronized ChocolateBoiler getInstance() {
    if (uniqueInstance == null) {
      System.out.println("Creating..");
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("Returning..");
    System.out.println("numCalled " + numCalled++);
    return uniqueInstance;
  }
  
  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
    }
  }
  
  public boolean isEmpty() {
    return empty;
  }
}