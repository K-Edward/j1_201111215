package com.sd.sort.v2;

// Comparator interface ����(Ŭ���� ���̾�׷� ����)
// ���� Comparator(Integer, String ���� �� interface�� implements �ؾ� ��)
public interface Comparator {
  public int compare(Object o1, Object o2);
  
  public boolean equals(Object o);
}