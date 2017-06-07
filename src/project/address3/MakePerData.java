package project.address3;

import java.util.Random;

public class MakePerData{
  public MakePerData(){
    PersonDAOImpl personDAOImpl = new PersonDAOImpl();
    PersonVO person = new PersonVO();
    
    String[] begin = {"김","이","박","최","정","신","강"};
    String[] middleMa = {"주","현","창","준","진","조","대","재","희","소","형","태","은","지","찬","철","충","동","건","승","영","한","하","정"};
    String[] middleFm = {"혜","예","희","주","다","유","주","현","미","소","은","지","승","연","영","하","윤","정","효","나","서"};
    String[] endMa = {"환","성","석","진","빈","원","주","열","민","현","원","근","경","섭","혁","호","철","규","수","하","서","웅","정","욱","우"};
    String[] endFm = {"혜","숙","희","연","선","선","영","빈","원","주","현","원","경","수","하","서","린","리","율","연","미"};
    String[] addre = {"서울","경기도","충청도","강원도","전라도","경상도","부산","제주도"};
    
    Random rand = new Random();
    
    //기본 자료 10개씩 생성
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
        sex = "남";
        b = middleMa[midM];
        c = endMa[edM];
      }
      else if(s==1){
        sex = "여";
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
      System.out.println("자료를 추가했습니다.");
    }
  }
}