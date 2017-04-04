package com.sd.turtle;

import ch.aplu.turtle.*;
import java.util.Observer;
import java.util.Observable;
import java.awt.geom.Point2D.Double;

public class MomTurtle extends Turtle implements Observer {
  Double babyCurpos;
  
  public MomTurtle(){}
  
  public void update(Observable o, Object arg){
    babyCurpos = ((BabyTurtle)o).myCurpos; //현재 위치를 잡아서 엄마가 아기 위치를 가지고 있도록.
    //이동시키는 함수는 moveTo
    moveTo(babyCurpos);
  }
}