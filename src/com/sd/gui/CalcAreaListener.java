package com.sd.gui;

import java.awt.event.*;
import javax.swing.*;

public class CalcAreaListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.println("Hello!!!!"); //������ �۵� Ȯ�ο�.
    
    JButton b = (JButton)e.getSource();
    
    JTextField radius = (JTextField)e.getSource();
    
    System.out.println(radius);
    
    String cmd = e.getActionCommand();
    
    if(cmd.equals("���")) {
      System.out.println("��� ��ư");
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