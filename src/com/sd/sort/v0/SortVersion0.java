package com.sd.sort.v0;

public class SortVersion0{
  public static void main(String[] args){
    String[] name = {"John","Adam","Skrien","Smith","Jones"};
    
    sort(name);
    
//    for(int i = data.length-1; i>=0; i--){ //���� data�� ���̴� 5�ϱ� -1�ؼ� 4, i�� 4���� �����ؼ� 0�� �ɶ� ���� �ϳ��� ����(--)�ش�.
//      int indexOfMax = 0;
//      for(int j = 1; j<=i; j++){
//        if(data[j].compareTo(data[indexOfMax])>0) { //���� indexOfMax�� 0�̴ϱ� data�� ù ��° ��(data[0])�� data[1]���� �÷����� ��
//          indexOfMax = j; //�� �ϴٰ� data[j].compareTo(data[0])���� 0���� �۴ٸ� data[j]�� �� �� ������� ���̰� 0���� ũ�ٸ� �� �� ������� ��
//                          //compareTo ����� 0���� ũ�ٸ� data[j]���� data[0]���� �� �� -> data[j]�� ������ ��
//                          //������ ���� �ڷ� �����ϴ� ���ڿ��� ã�� �ֱ� ������
//                          //���� ��� j=2�϶� compartTo���� 0���� ũ�� ���Դٸ� �� ���� ���� ���ʹ� data[j].compareTo(data[2])�� ��(j�� 2 �����̹Ƿ� 3�̵�)
//                          //��������� indexOfMax���� ���� ����� ���ڿ� �� ���� �� �������� �ϴ� ���ڿ��� ���� �ε��� ��ȣ�� �����.          
//        }
//      }
//      String temp = data[i]; //ù��° �ݺ������� i�� �迭�� ���� �� ��ȣ�� ���۵Ǿ��� compareTo�� ���ؼ� ã�� ���� �ڷΰ��� �ϴ� ��ȣ�� �ڷ�� ��ü���ִ� �۾�
//      data[i] = data[indexOfMax]; //���⼭ data[4]�ڸ��� data[3]�� ����
//      data[indexOfMax] = temp; //data[4]�ڸ��� �ִ� ���� �����ص״� temp���� data[3]�ڸ��� �־� �ָ鼭 ���� �ڷΰ����� data[3]�� �ڷᰡ ���� �ڷ� ��.
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
    for(int i = data.length-1; i>=0; i--){ //���� data�� ���̴� 5�ϱ� -1�ؼ� 4, i�� 4���� �����ؼ� 0�� �ɶ� ���� �ϳ��� ����(--)�ش�.
      int indexOfMax = 0;
      for(int j = 1; j<=i; j++){
        if(data[j].compareTo(data[indexOfMax])>0) { //���� indexOfMax�� 0�̴ϱ� data�� ù ��° ��(data[0])�� data[1]���� �÷����� ��
          indexOfMax = j; //�� �ϴٰ� data[j].compareTo(data[0])���� 0���� �۴ٸ� data[j]�� �� �� ������� ���̰� 0���� ũ�ٸ� �� �� ������� ��
                          //compareTo ����� 0���� ũ�ٸ� data[j]���� data[0]���� �� �� -> data[j]�� ������ ��
                          //������ ���� �ڷ� �����ϴ� ���ڿ��� ã�� �ֱ� ������
                          //���� ��� j=2�϶� compartTo���� 0���� ũ�� ���Դٸ� �� ���� ���� ���ʹ� data[j].compareTo(data[2])�� ��(j�� 2 �����̹Ƿ� 3�̵�)
                          //��������� indexOfMax���� ���� ����� ���ڿ� �� ���� �� �������� �ϴ� ���ڿ��� ���� �ε��� ��ȣ�� �����.          
        }
      }
      String temp = data[i]; //ù��° �ݺ������� i�� �迭�� ���� �� ��ȣ�� ���۵Ǿ��� compareTo�� ���ؼ� ã�� ���� �ڷΰ��� �ϴ� ��ȣ�� �ڷ�� ��ü���ִ� �۾�
      data[i] = data[indexOfMax]; //���⼭ data[4]�ڸ��� data[3]�� ����
      data[indexOfMax] = temp; //data[4]�ڸ��� �ִ� ���� �����ص״� temp���� data[3]�ڸ��� �־� �ָ鼭 ���� �ڷΰ����� data[3]�� �ڷᰡ ���� �ڷ� ��.
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
  