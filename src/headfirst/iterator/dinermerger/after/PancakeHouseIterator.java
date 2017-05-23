package headfirst.iterator.dinermerger.after;

import java.util.ArrayList;
import headfirst.iterator.dinermerger.before.MenuItem;

public class PancakeHouseIterator implements Iterator {
   ArrayList items;
   int position = 0;
  
  public PancakeHouseIterator(ArrayList items){
    this.items = items;
  }
  
  public boolean hasNext(){
    if(position >= items.size()){
      return false;
    }
    else {
      return true;
    }
  }
  
  public Object next(){
    Object menus = items.get(position);
    position++;
    return menus;
  }
}