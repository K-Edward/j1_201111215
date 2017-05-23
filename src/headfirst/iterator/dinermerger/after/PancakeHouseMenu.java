package headfirst.iterator.dinermerger.after;

import java.util.ArrayList;
import headfirst.iterator.dinermerger.before.MenuItem;

public class PancakeHouseMenu implements Menu {
  ArrayList<MenuItem> menuitems;
  
  //static final int MAX_ITEMS = 3;
  
  //int numberOfItems = 0;
  
  public PancakeHouseMenu() {
    menuitems = new ArrayList<MenuItem>();
    addItem("BLT","Bacon, Lettuce, Tomato", false, 2.99);
    addItem("Vegetarian BLT","(Fakin') Bacon, Lettuce, Tomato", true, 2.99);
    addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
  }
  
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n, d, v, p);
    menuitems.add(menuItem);
    //numberOfItems++;
  }
  
  public ArrayList getMenuItems(){
    return menuitems;
  }
  
  public Iterator createIterator(){
    return new PancakeHouseIterator(menuitems);
  }
}