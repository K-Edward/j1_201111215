package project.address;

public class StringComparator implements Comparator{
  public StringComparator(){
  
  }
  
  public int compare(Object o1, Object o2){
    //String s1 = String[] o1;
    //String s2 = String[] o2;
    
    return ((String [])o1)[0].compareTo(((String [])o2)[0]);
  }
}