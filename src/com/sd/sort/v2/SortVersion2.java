package com.sd.sort.v2;

import com.sd.turtle.WeightTurtle;

public class SortVersion2 {
  public static void main(String[] args) {
    String[] name = {"John", "Adam", "Skrien", "Smith", "Jones"}; //이름 배열
    
    //StrintComparator를 이용해서 name 배열 sort
    Comparator stringComp = new StringComparator();
    Sorter.sort(name, stringComp);
    
    Integer[] number = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)}; //숫자 배열
    
    //IntegerComparator를 이용해서 number 배열 sort
    Comparator integerComp = new IntegerComparator();
    Sorter.sort(number, integerComp);
    
    //출력
    for(int i=0; i<name.length; i++){
      System.out.println("name[" +i+ "]=" +name[i]);
    }
    System.out.println("");
    for(int i=0; i<number.length; i++){
      System.out.println("number[" +i+ "]=" +number[i]);
    }
    System.out.println("");
    
    //turtle에 무게를 정해주고 무게별로 sort해보기
    WeightTurtle wt30 = new WeightTurtle(30); //무게 30인 turtle -> wt30
    WeightTurtle wt10 = new WeightTurtle(10); //무게 10인 turtle -> wt10
    WeightTurtle wt20 = new WeightTurtle(20); //무게 20인 turtle -> wt20
    
    WeightTurtle[] wts={wt30, wt10, wt20}; //만들어진 각각의 객체(?)를 배열에 집어 넣음
    Comparator turtleComp = new TurtleComparator();
    Sorter.sort(wts, turtleComp); //TurtleComparator를 이용해서 sort.
    
    //거북이를 sort한 결과 출력
    for(int i = 0; i < wts.length; i++){
      System.out.println("WeightTurtleArray[" +i+ "]=" +wts[i].getWeight());
    }
    System.out.println("");
    
    //날짜를 sort하는 DateComparator 사용
    
    //문자열을 역으로 sort하는 ReverseComparator 사용
    String[] name1 = {"John", "Adam", "Skrien", "Smith", "Jones"}; //이름 배열
    
    Comparator reverseComp = new ReverseComparator(stringComp);
    Sorter.sort(name1, reverseComp);
    
    //역 문자열 sort 결과 출력
    for(int i=0; i<name1.length; i++){
      System.out.println("name1[" +i+ "]=" +name1[i]);
    }
    System.out.println("");
    
  }
}