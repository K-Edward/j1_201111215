package com.sd.sort.v2;

import ch.aplu.turtle.*;
import com.sd.turtle.WeightTurtle;

//객체(?)를 sort해주는 comparator이다.
//예전에 만들어둔 WeightTurtle을 사용해준다.
//WeightTurtle은 거북이무게를 입력하는 역할.
public class TurtleComparator implements Comparator {
   public int compare(Object o1, Object o2){
    return ((WeightTurtle)o1).getWeight() - ((WeightTurtle)o2).getWeight(); //getWeight는 WeightTurtle에 있는 함수로 무게를 반환한다.
  }
}