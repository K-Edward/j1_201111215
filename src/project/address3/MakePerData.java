package project.address3;

import java.util.Random;

public class MakePerData{
  public MakePerData(){
    PersonDAOImpl personDAOImpl = new PersonDAOImpl();
    PersonVO person = new PersonVO();
    
    String[] begin = {"��","��","��","��","��","��","��"};
    String[] middleMa = {"��","��","â","��","��","��","��","��","��","��","��","��","��","��","��","ö","��","��","��","��","��","��","��","��"};
    String[] middleFm = {"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ȿ","��","��"};
    String[] endMa = {"ȯ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ȣ","ö","��","��","��","��","��","��","��","��"};
    String[] endFm = {"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
    String[] addre = {"����","��⵵","��û��","������","����","���","�λ�","���ֵ�"};
    
    Random rand = new Random();
    
    //�⺻ �ڷ� 10���� ����
    for(int i = 0; i<10; i++){
      int beg = rand.nextInt(7);
      int midM = rand.nextInt(24);
      int midF = rand.nextInt(21);
      int edM = rand.nextInt(25);
      int edF = rand.nextInt(21);
      int bt = rand.nextInt(4);
      
      String a = begin[beg];
      String b = null;
      String c = null;
      String sex = null;
      
      int s = rand.nextInt(2);
      
      if(s==0){
        sex = "��";
        b = middleMa[midM];
        c = endMa[edM];
      }
      else if(s==1){
        sex = "��";
        b = middleFm[midF];
        c = endFm[edF]; 
      }
      
      int midNum = 10000 + rand.nextInt(9999);
      String mNum = ""+midNum+"";
      
      int lastNum = 10000 + rand.nextInt(9999);
      String lNum = ""+lastNum+"";
      
      String name = a+b+c;
      String pNum = "010-"+mNum.substring(1)+"-"+lNum.substring(1);
      
      int age = 17 + rand.nextInt(44);
      
      int ar = rand.nextInt(8);
      String ars = addre[ar];
      
      person.setName(name);
      person.setSex(sex);
      person.setAge(age);
      person.setPNum(pNum);
      person.setAddress(ars);
      personDAOImpl.insert(person);
      System.out.println("�ڷḦ �߰��߽��ϴ�.");
    }
  }
}