package com.sd.sort.v2;

import java.util.Date;

//날짜를 sort해주는 comparator이다.
//문자열이기 때문에 CompareTo를 사용해준다.
public class DateComparator implements Comparator{
  public DateComparator(){
    
  }
  
  public int compare(Object o1, Object o2){
    return ((Date)o1).compareTo((Date)o2);
  }
}