package project.address;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class AddrDisplay implements Observer {
  private String name;
  private String sex;
  private String age;
  private String phoneNumber;
  private String address;
  private Subject privateData;
  private int count;
  
  public AddrDisplay(Subject privateDate){
    this.privateData = privateDate;
    privateData.registerObserver(this);
  }
  
  public void update(String name, String sex, String age, String pN, String addr, int count) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.phoneNumber = pN;
    this.address = addr;
    this.count = count;
    display(count);
  }
  
  public void display(int count){
    //여기에 주소록 리스트를 새로 띄우는 코드가 있었으면 좋겠다.
//    JFrame f = new JFrame();
//    
//    JPanel panel = new JPanel();
//    
//    f.getContentPane().add(panel);
//    
//    JButton btn1 = new JButton("이름");
//    JButton btn2 = new JButton("나이");
//    JButton btn3 = new JButton("성별");
//    
//    Object row[][] = new Object[10][5];
//    row[count][0] = name;
//    row[count][1] = sex;
//    row[count][2] = age;
//    row[count][3] = phoneNumber;
//    row[count][4] = address;
//    
//    Object col[] = {"이름","성별","나이","연락처","주소"};
//    
//    JTable table = new JTable(row,col);
//    
//    panel.add(btn1);
//    panel.add(btn2);
//    panel.add(btn3);
//    panel.add(new JScrollPane(table));
//    
//    f.pack();
//    f.setVisible(true);
    
    System.out.println(name + "," + sex + "," + age + "," + phoneNumber + "," + address);
  }
  
}