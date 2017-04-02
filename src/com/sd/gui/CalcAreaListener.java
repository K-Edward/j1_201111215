package com.sd.gui;

import java.awt.event.*;
import javax.swing.*;

public class CalcAreaListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.println("Hello!!!!"); //리스너 작동 확인용.
    
    JButton b = (JButton)e.getSource();
    
    JTextField radius = (JTextField)e.getSource();
    
    System.out.println(radius);
    
    String cmd = e.getActionCommand();
    
    if(cmd.equals("계산")) {
      System.out.println("계산 버튼");
      b.setText("계산했습니다.");
    }
    else if(cmd.equals("취소")) {
      System.out.println("취소 버튼");
      b.setText("취소했습니다.");
    }
    else {
      System.out.println("버튼을 '..했습니다'로 변경하면 cmd도 변경된다.");
    }
  }
}