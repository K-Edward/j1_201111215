package com.sd.sort.v2;

import java.util.Date;

//��¥�� sort���ִ� comparator�̴�.
//���ڿ��̱� ������ CompareTo�� ������ش�.
public class DateComparator implements Comparator{
  public DateComparator(){
    
  }
  
  public int compare(Object o1, Object o2){
    return ((Date)o1).compareTo((Date)o2);
  }
}