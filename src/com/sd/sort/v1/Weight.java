package com.sd.sort.v1;

import java.util.Arrays;

public class Weight implements Comparable {
  private int kilo;
  public Weight(int k) {
    kilo = k; //Weight를 통해서 받은 int형 k를 kilo 변수에 넣어줌
  }
  // *중요* compareTo 구현
  public int compareTo(Object o) {
    Weight w = (Weight)o;
    return this.kilo-w.kilo; //Weight를 통해서 받은 kilo와 compareTo()를 통해서 받은 w.kilo를 비교해줌
                             //int 형을 단순히 빼는 과정이기 때문에 결과형은 양수 혹은 음수 혹은 0
  }
  
  //이건 메세지 출력을 위한거라고 하셨음
  public String toString() {
    String msg = kilo+"";
    return msg;
  }
}