package headfirst.iterator.dinermerger.before;

import java.util.*;
  
public class PancakeHouseMenu {
  ArrayList<MenuItem> menuitems;
  
  public PancakeHouseMenu() {
    menuitems = new ArrayList<MenuItem>();
    addItem("BLT","Bacon, Lettuce, Tomato", false, 2.99);
    addItem("Vegetarian BLT","(Fakin') Bacon, Lettuce, Tomato", true, 2.99);
    addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
  }
  
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n, d, v, p);
    menuitems.add(menuItem);
  }
  
  public ArrayList getMenuItems(){
    return menuitems;
  }
}