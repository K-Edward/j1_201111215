package com.sd.sort.v2;

//import ch.aplu.turtle.*;
import com.sd.turtle.WeightTurtle;

//��ü(?)�� sort���ִ� comparator�̴�.
//������ ������ WeightTurtle�� ������ش�.
//WeightTurtle�� �ź��̹��Ը� �Է��ϴ� ����.
public class TurtleComparator implements Comparator {
   public int compare(Object o1, Object o2){
    return ((WeightTurtle)o1).getWeight() - ((WeightTurtle)o2).getWeight(); //getWeight�� WeightTurtle�� �ִ� �Լ��� ���Ը� ��ȯ�Ѵ�.
  }
}