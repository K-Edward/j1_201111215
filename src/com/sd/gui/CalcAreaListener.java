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
    
    if(cmd.equals("���")) {
      System.out.println("��� ��ư");
      radius = Integer.parseInt(r1.getText());
      area = radius*radius*3.141592;
      result = area+"";
      r2.setText(result);
      b.setText("����߽��ϴ�.");
    }
    else if(cmd.equals("���")) {
      System.out.println("��� ��ư");
      b.setText("����߽��ϴ�.");
    }
    else {
      System.out.println("��ư�� '..�߽��ϴ�'�� �����ϸ� cmd�� ����ȴ�.");
    }
  }
}