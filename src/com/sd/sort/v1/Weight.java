package com.sd.sort.v1;

import java.util.Arrays;

public class Weight implements Comparable {
  private int kilo;
  public Weight(int k) {
    kilo = k; //Weight�� ���ؼ� ���� int�� k�� kilo ������ �־���
  }
  // *�߿�* compareTo ����
  public int compareTo(Object o) {
    Weight w = (Weight)o;
    return this.kilo-w.kilo; //Weight�� ���ؼ� ���� kilo�� compareTo()�� ���ؼ� ���� w.kilo�� ������
                             //int ���� �ܼ��� ���� �����̱� ������ ������� ��� Ȥ�� ���� Ȥ�� 0
  }
  
  //�̰� �޼��� ����� ���ѰŶ�� �ϼ���
  public String toString() {
    String msg = kilo+"";
    return msg;
  }
}