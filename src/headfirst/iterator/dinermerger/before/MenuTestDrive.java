package headfirst.iterator.dinermerger.before;

import java.util.*;

public class MenuTestDrive {
  public static void main(String[] args){
    
    
    printMenu();
  }
  
  public static void printMenu(){
    DinerMenu dm = new DinerMenu();
    PancakeHouseMenu pm = new PancakeHouseMenu();
    
    ArrayList menus = pm.getMenuItems();
    
    for(int i = 0; i< menus.size(); i++){
      MenuItem mi = (MenuItem)menus.get(i);
      System.out.print(mi.getName());
      System.out.println("\t\t" + mi.getPrice());
      System.out.println("\t" + mi.getDescription());
    }
    
    MenuItem[] menus2 = dm.getMenuItems();
    
    for(int i = 0; i < menus2.length; i++){
      MenuItem mi = menus2[i];
      System.out.print(mi.getName());
      System.out.println("\t\t" + mi.getPrice());
      System.out.println("\t" + mi.getDescription());
    }
  }
}