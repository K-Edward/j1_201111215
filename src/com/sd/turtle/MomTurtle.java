package com.sd.turtle;

import ch.aplu.turtle.*;
import java.util.Observer;
import java.util.Observable;
import java.awt.geom.Point2D.Double;

public class MomTurtle extends Turtle implements Observer {
  Double babyCurpos;
  
  public MomTurtle(){}
  
  public void update(Observable o, Object arg){
    babyCurpos = ((BabyTurtle)o).myCurpos; //���� ��ġ�� ��Ƽ� ������ �Ʊ� ��ġ�� ������ �ֵ���.
    //�̵���Ű�� �Լ��� moveTo
    moveTo(babyCurpos);
  }
}