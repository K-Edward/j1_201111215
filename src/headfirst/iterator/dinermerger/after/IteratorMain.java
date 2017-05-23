package headfirst.iterator.dinermerger.after;

public class IteratorMain {
  public static void main(String[] args){
    PancakeHouseMenu pm = new PancakeHouseMenu();
    DinerMenu dm = new DinerMenu();
    
    Iterator i1 = pm.createIterator();
    Iterator i2 = dm.createIterator();
    
    while(i1.hasNext()){
      System.out.println(i1.next());
    }
    System.out.println("----------------------");
    while(i2.hasNext()){
      System.out.println(i2.next());
    }
  }
}