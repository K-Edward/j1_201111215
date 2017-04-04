package com.sd.turtle;

import java.util.Observer;
import java.util.Observable;
import ch.aplu.turtle.*;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;

public class BabyTurtle extends Observable { //Observale은 class 이므로 implements로 쓸 수 없음, Turtle와 다중 상속 안됨.
  Turtle baby;
  ArrayList<Observer> obs;
  Double myCurpos;
  
  public BabyTurtle(){
    baby = new Turtle();
    obs = new ArrayList<Observer>();
  }
  
  public void addObverser(Observer o){
    obs.add(o);
  }
  
  public void notifyObservers(){
    for(Observer o:obs)
      o.update(this, 1);
  }
  
  protected void setChanged(){
    myCurpos = baby.getPos();
  }
  
  public void move(int x, int y){
    baby.moveTo(x,y);
  }
  
}