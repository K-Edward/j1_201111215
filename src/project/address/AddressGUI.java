package project.address;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class AddressGUI {  
  public static void main(String[] args){
    AddressGUI aG = new AddressGUI();
    aG.openView();
    //�Ʒ� ����� �ȵǸ鼭 ������ ���ϵ��� ���� ������.
    //����.
//    PrivateData pData = new PrivateData();
//    
//    AddrDisplay aDisplay = new AddrDisplay(pData);
//    
//    pData.setDocument("��âȯ", "��", "26", "010-7440-0776", "��⵵",0);
    
  }
  
  public void openView(){
    JFrame f = new JFrame();
    
    JPanel panel = new JPanel();
    
    f.getContentPane().add(panel);
        
    JButton btn1 = new JButton("�̸�");
    JButton btn2 = new JButton("����");
    JButton btn3 = new JButton("����");
    
    Object row[][] = new Object[10][30];
    
    String[] begin = {"��","��","��","��","��","��","��"};
    String[] middleMa = {"��","��","â","��","��","��","��","��","��","��","��","��","��","��","��","ö","��","��","��","��","��","��","��","��"};
    String[] middleFm = {"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ȿ","��","��"};
    String[] endMa = {"ȯ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ȣ","ö","��","��","��","��","��","��","��","��"};
    String[] endFm = {"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
    String[] addre = {"����","��⵵","��û��","������","����","���","�λ�","���ֵ�"};
    
    Random rand = new Random();
    
    //�⺻ �ڷ� 10�� ����
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
      
      row[i][0] = name;
      row[i][1] = sex;
      row[i][2] = age;
      row[i][3] = pNum;
      row[i][4] = ars;
    }
  
    Object col[] = {"�̸�","����","����","����ó","�ּ�"};
    
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
      
      if(cmd.equals("�̸�")) {
        Comparator stringComp = new StringComparator();
        //���� ���� ����X
        b.setText("�̸�������");
        System.out.println("���� ���� ���� ����");
      }
      else if(cmd.equals("����")) {
        Comparator integerComp = new IntegerComparator();
        //���� ���� ����X
        b.setText("���̼�����");
        System.out.println("���� ���� ���� ����");
      }
      else if(cmd.equals("����")) {
        //���� ���� ����X
        b.setText("���� ����");
        System.out.println("���� ���� ���� ����");
      }
      else {
        System.out.println("�����ϰ�ʹ�. ȭ������.");
      }
    }
  }
    
}

