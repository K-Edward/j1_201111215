package com.sd.sort.v2;

// Comparator interface 구현(클래스 다이어그램 참조)
// 여러 Comparator(Integer, String 들이 이 interface를 implements 해야 함)
public interface Comparator {
  public int compare(Object o1, Object o2);
  
  public boolean equals(Object o);
}