package headfirst.factory.pizzaaf.small;

import java.util.*;

public abstract class Pizza{
  String name;
  Dough dough;
  //String sauce;
  Cheese cheese;
  ArrayList<String> toppings = new ArrayList<String>();
  
//  public void prepare(){
//    System.out.println("Preparing " + name);
//  }
  
  abstract void prepare();
  
  public void bake(){
    System.out.println("Baking " + name);
  }
  
  public void cut(){
    System.out.println("Cutting " + name);
  }
  
  public void box(){
    System.out.println("Boxing " + name);
  }
  
  public String getName(){
    return name;
  }
  
  public void setName(String n){
    this.name = n;
  }
  
  public String toString(){
    StringBuffer display = new StringBuffer();
    display.append("------" + name + "------\n");
    if(dough != null){
      display.append(dough);
      display.append("\n");
    }
    
    if(cheese != null){
      display.append(cheese);
      display.append("\n");
    }
    
    return display.toString();
  }
}