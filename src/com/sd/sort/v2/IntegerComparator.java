package com.sd.sort.v2;

//Integer형 sort해주는 Comparator이다.
//일반적으로 빼기 형태를 사용한다.
public class IntegerComparator implements Comparator{
  public IntegerComparator(){
    
  }
  
  public int compare(Object o1, Object o2){
    return (Integer)o1 - (Integer)o2;
  }
}