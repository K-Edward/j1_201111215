package project.address;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class AddressGUI {  
  public static void main(String[] args){
    AddressGUI aG = new AddressGUI();
    aG.openView();
    //아래 방법이 안되면서 나머지 파일들이 쓸모 없어짐.
    //슬픔.
//    PrivateData pData = new PrivateData();
//    
//    AddrDisplay aDisplay = new AddrDisplay(pData);
//    
//    pData.setDocument("김창환", "남", "26", "010-7440-0776", "경기도",0);
    
  }
  
  public void openView(){
    JFrame f = new JFrame();
    
    JPanel panel = new JPanel();
    
    f.getContentPane().add(panel);
        
    JButton btn1 = new JButton("이름");
    JButton btn2 = new JButton("나이");
    JButton btn3 = new JButton("성별");
    
    Object row[][] = new Object[10][30];
    
    String[] begin = {"김","이","박","최","정","신","강"};
    String[] middleMa = {"주","현","창","준","진","조","대","재","희","소","형","태","은","지","찬","철","충","동","건","승","영","한","하","정"};
    String[] middleFm = {"혜","예","희","주","다","유","주","현","미","소","은","지","승","연","영","하","윤","정","효","나","서"};
    String[] endMa = {"환","성","석","진","빈","원","주","열","민","현","원","근","경","섭","혁","호","철","규","수","하","서","웅","정","욱","우"};
    String[] endFm = {"혜","숙","희","연","선","선","영","빈","원","주","현","원","경","수","하","서","린","리","율","연","미"};
    String[] addre = {"서울","경기도","충청도","강원도","전라도","경상도","부산","제주도"};
    
    Random rand = new Random();
    
    //기본 자료 10개 생성
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
      
      row[i][0] = name;
      row[i][1] = sex;
      row[i][2] = age;
      row[i][3] = pNum;
      row[i][4] = ars;
    }
  
    Object col[] = {"이름","성별","나이","연락처","주소"};
    
    JTable table = new JTable(row,col);
    
    btn1.addActionListener(new registerListener());
    btn2.addActionListener(new registerListener());
    btn3.addActionListener(new registerListener());
    
    panel.add(btn1);
    panel.add(btn2);
    panel.add(btn3);
    panel.add(new JScrollPane(table));
    
    f.pack();
    f.setVisible(true);
  }
  
  class registerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JButton b = (JButton)e.getSource();
      
      String cmd = e.getActionCommand();
      
      if(cmd.equals("이름")) {
        Comparator stringComp = new StringComparator();
        //아직 정렬 구현X
        b.setText("이름순정렬");
        System.out.println("아직 정렬 구현 못함");
      }
      else if(cmd.equals("나이")) {
        Comparator integerComp = new IntegerComparator();
        //아직 정렬 구현X
        b.setText("나이순정렬");
        System.out.println("아직 정렬 구현 못함");
      }
      else if(cmd.equals("성별")) {
        //아직 정렬 구현X
        b.setText("성별 정렬");
        System.out.println("아직 정렬 구현 못함");
      }
      else {
        System.out.println("정렬하고싶다. 화가난다.");
      }
    }
  }
    
}

