package com.sd.turtle;

import java.awt.Color;
//import ch.aplu.turtle.*;

public class WeightTurtle /*extends Turtle*/ { //sort v2에서 계속 ch.aplu.turtle class를 찾을 수 없는 문제가 생겨서 관련 extends를 주석처리함
  protected int weight;
  
  public WeightTurtle(int w) {
    weight = w;
//    setColor(Color.red);
//    setPenColor(Color.red);
  }
  
  public int getWeight() {
    return weight;
  }
}