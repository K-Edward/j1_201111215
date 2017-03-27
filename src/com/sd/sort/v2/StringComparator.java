package com.sd.sort.v2;

//문자열을 sort해주는 comparator이다.
//문자열이기 때문에 CompareTo를 사용해준다.
//(Integer)로 형변환? 하여 Integer처럼 비교할 수도 있다.
//Integer.parseInt((String) o1) - Integer.parseInt((String) o2);
public class StringComparator implements Comparator{
  public StringComparator(){
    
  }
  
  public int compare(Object o1, Object o2){
    String s1 = (String)o1; //두가지 비교대상 문자열을 s1, s2에 저장
    String s2 = (String)o2;
    
    return s1.compareTo(s2);
  }
}