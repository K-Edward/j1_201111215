package com.sd.sort.v2;

//문자열을 거꾸로 sort해주는 comparator이다.
//문자열이기 때문에 CompareTo를 사용해준다.
public class ReverseComparator implements Comparator{
  Comparator c;
  
  public ReverseComparator(Comparator c) {
    this.c = c; 
  }
  
  public int compare(Object o1, Object o2) {
    return c.compare(o2, o1);
  }
}