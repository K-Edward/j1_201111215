package com.sd.sort.v2;

import com.sd.turtle.WeightTurtle;

public class SortVersion2 {
  public static void main(String[] args) {
    String[] name = {"John", "Adam", "Skrien", "Smith", "Jones"}; //�̸� �迭
    
    //StrintComparator�� �̿��ؼ� name �迭 sort
    Comparator stringComp = new StringComparator();
    Sorter.sort(name, stringComp);
    
    Integer[] number = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)}; //���� �迭
    
    //IntegerComparator�� �̿��ؼ� number �迭 sort
    Comparator integerComp = new IntegerComparator();
    Sorter.sort(number, integerComp);
    
    //���
    for(int i=0; i<name.length; i++){
      System.out.println("name[" +i+ "]=" +name[i]);
    }
    System.out.println("");
    for(int i=0; i<number.length; i++){
      System.out.println("number[" +i+ "]=" +number[i]);
    }
    System.out.println("");
    
    //turtle�� ���Ը� �����ְ� ���Ժ��� sort�غ���
    WeightTurtle wt30 = new WeightTurtle(30); //���� 30�� turtle -> wt30
    WeightTurtle wt10 = new WeightTurtle(10); //���� 10�� turtle -> wt10
    WeightTurtle wt20 = new WeightTurtle(20); //���� 20�� turtle -> wt20
    
    WeightTurtle[] wts={wt30, wt10, wt20}; //������� ������ ��ü(?)�� �迭�� ���� ����
    Comparator turtleComp = new TurtleComparator();
    Sorter.sort(wts, turtleComp); //TurtleComparator�� �̿��ؼ� sort.
    
    //�ź��̸� sort�� ��� ���
    for(int i = 0; i < wts.length; i++){
      System.out.println("WeightTurtleArray[" +i+ "]=" +wts[i].getWeight());
    }
    System.out.println("");
    
    //��¥�� sort�ϴ� DateComparator ���
    
    //���ڿ��� ������ sort�ϴ� ReverseComparator ���
    String[] name1 = {"John", "Adam", "Skrien", "Smith", "Jones"}; //�̸� �迭
    
    Comparator reverseComp = new ReverseComparator(stringComp);
    Sorter.sort(name1, reverseComp);
    
    //�� ���ڿ� sort ��� ���
    for(int i=0; i<name1.length; i++){
      System.out.println("name1[" +i+ "]=" +name1[i]);
    }
    System.out.println("");
    
  }
}