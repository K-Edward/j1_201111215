package com.sd.sort.v2;

//���ڿ��� sort���ִ� comparator�̴�.
//���ڿ��̱� ������ CompareTo�� ������ش�.
//(Integer)�� ����ȯ? �Ͽ� Integeró�� ���� ���� �ִ�.
//Integer.parseInt((String) o1) - Integer.parseInt((String) o2);
public class StringComparator implements Comparator{
  public StringComparator(){
    
  }
  
  public int compare(Object o1, Object o2){
    String s1 = (String)o1; //�ΰ��� �񱳴�� ���ڿ��� s1, s2�� ����
    String s2 = (String)o2;
    
    return s1.compareTo(s2);
  }
}