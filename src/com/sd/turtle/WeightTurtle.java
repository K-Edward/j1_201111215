package com.sd.turtle;

import java.awt.Color;
//import ch.aplu.turtle.*;

public class WeightTurtle /*extends Turtle*/ { //sort v2���� ��� ch.aplu.turtle class�� ã�� �� ���� ������ ���ܼ� ���� extends�� �ּ�ó����
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