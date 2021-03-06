package com.sd.sort.v0;

public class SortVersion0{
  public static void main(String[] args){
    String[] name = {"John","Adam","Skrien","Smith","Jones"};
    
    sort(name);
    
//    for(int i = data.length-1; i>=0; i--){ //현재 data의 길이는 5니까 -1해서 4, i는 4부터 시작해서 0이 될때 까지 하나씩 낮춰(--)준다.
//      int indexOfMax = 0;
//      for(int j = 1; j<=i; j++){
//        if(data[j].compareTo(data[indexOfMax])>0) { //현재 indexOfMax는 0이니까 data의 첫 번째 값(data[0])을 data[1]부터 늘려가며 비교
//          indexOfMax = j; //비교 하다가 data[j].compareTo(data[0])값이 0보다 작다면 data[j]가 더 앞 순서라는 말이고 0보다 크다면 더 뒷 순서라는 말
//                          //compareTo 결과가 0보다 크다면 data[j]값이 data[0]보다 더 뒤 -> data[j]가 기준이 됨
//                          //이유는 가장 뒤로 가야하는 문자열을 찾고 있기 때문에
//                          //예를 들어 j=2일때 compartTo값이 0보다 크게 나왔다면 그 다음 루프 부터는 data[j].compareTo(data[2])가 됨(j는 2 다음이므로 3이됨)
//                          //결론적으로 indexOfMax에는 현재 저장된 문자열 중 가장 뒷 순서여야 하는 문자열의 현재 인덱스 번호가 저장됨.          
//        }
//      }
//      String temp = data[i]; //첫번째 반복문에서 i가 배열의 가장 끝 번호로 시작되었고 compareTo를 통해서 찾은 가장 뒤로가야 하는 번호의 자료와 교체해주는 작업
//      data[i] = data[indexOfMax]; //여기서 data[4]자리에 data[3]이 들어가고
//      data[indexOfMax] = temp; //data[4]자리에 있던 값을 저장해뒀던 temp값을 data[3]자리에 넣어 주면서 가장 뒤로가야할 data[3]의 자료가 가장 뒤로 감.
//    }
    
    Integer[] number = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
    
    sort(number);
    
//    for(int i = number.length-1; i>=0; i--){
//      int indexOfMax = 0;
//      for(int j = 1; j<=i; j++){
//        if(number[j] > number[indexOfMax]){
//          indexOfMax = j;
//        }
//      }
//      Integer temp = number[i];
//      number[i] = number[indexOfMax];
//      number[indexOfMax] = temp;
//    }
        
    for(int i = 0; i<name.length; i++){
      System.out.println("name[" + i + "]=" + name[i]);
    }
    
    for(int i =0; i<number.length; i++){
      System.out.println("number[" + i + "]=" + number[i]);
    }
  }
  
  public static void sort(String[] data){
    for(int i = data.length-1; i>=0; i--){ //현재 data의 길이는 5니까 -1해서 4, i는 4부터 시작해서 0이 될때 까지 하나씩 낮춰(--)준다.
      int indexOfMax = 0;
      for(int j = 1; j<=i; j++){
        if(data[j].compareTo(data[indexOfMax])>0) { //현재 indexOfMax는 0이니까 data의 첫 번째 값(data[0])을 data[1]부터 늘려가며 비교
          indexOfMax = j; //비교 하다가 data[j].compareTo(data[0])값이 0보다 작다면 data[j]가 더 앞 순서라는 말이고 0보다 크다면 더 뒷 순서라는 말
                          //compareTo 결과가 0보다 크다면 data[j]값이 data[0]보다 더 뒤 -> data[j]가 기준이 됨
                          //이유는 가장 뒤로 가야하는 문자열을 찾고 있기 때문에
                          //예를 들어 j=2일때 compartTo값이 0보다 크게 나왔다면 그 다음 루프 부터는 data[j].compareTo(data[2])가 됨(j는 2 다음이므로 3이됨)
                          //결론적으로 indexOfMax에는 현재 저장된 문자열 중 가장 뒷 순서여야 하는 문자열의 현재 인덱스 번호가 저장됨.          
        }
      }
      String temp = data[i]; //첫번째 반복문에서 i가 배열의 가장 끝 번호로 시작되었고 compareTo를 통해서 찾은 가장 뒤로가야 하는 번호의 자료와 교체해주는 작업
      data[i] = data[indexOfMax]; //여기서 data[4]자리에 data[3]이 들어가고
      data[indexOfMax] = temp; //data[4]자리에 있던 값을 저장해뒀던 temp값을 data[3]자리에 넣어 주면서 가장 뒤로가야할 data[3]의 자료가 가장 뒤로 감.
    }
  }
  
  public static void sort(Integer[] number){
    for(int i = number.length-1; i>=0; i--){
      int indexOfMax = 0;
      for(int j = 1; j<=i; j++){
        if(number[j] > number[indexOfMax]){
          indexOfMax = j;
        }
      }
      Integer temp = number[i];
      number[i] = number[indexOfMax];
      number[indexOfMax] = temp;
    }
  }

}
  