package com.sd.gui;

import java.awt.event.*;
import javax.swing.*;

public class CalcAreaListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    JButton b = (JButton)e.getSource();
    JTextField r1 = (JTextField)e.getSource();
    JTextField r2 = (JTextField)e.getSource();
    
    String cmd = e.getActionCommand();
    int radius;
    double area;
    String result;
    
    if(cmd.equals("계산")) {
      System.out.println("계산 버튼");
      radius = Integer.parseInt(r1.getText());
      area = radius*radius*3.141592;
      result = area+"";
      r2.setText(result);
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