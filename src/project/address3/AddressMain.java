package project.address3;

import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.awt.event.*;

public class AddressMain extends JFrame{
  public static void main(String args[]){
    //MakePerData mp = new MakePerData();
    //���� ���̺� ����� �ڵ嵵 �ʿ�. 
    PersonDAOImpl person = new PersonDAOImpl();
    person.createTable();
    
    int people = person.countTuples();
    
    //�� �� ����ø��� ��ü �ڷ��� ������ 100���� �ȵǸ� 10���� ���� �߰���
    if(people < 100){
      MakePerData mp = new MakePerData();
    }
    
    AddressMain am = new AddressMain();
    am.openView("id");
  }
  
  
  class menuListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      MenuItem b = (MenuItem)e.getSource();
      
      String cmd = e.getActionCommand();
      
      if(cmd.equals("�̸���")) {
        openView("name");
      }
      else if(cmd.equals("���̼�")) {
        openView("age");
      }
      else if(cmd.equals("����")) {
        openView("sex");
      }
      else if(cmd.equals("�̸����� ã��")){
        searchView("�̸�");
      }
      else if(cmd.equals("��ȣ�� ã��")){
        searchView("��ȣ");
      }
      else if(cmd.equals("�߰�")){
        insertView(0, "��âȯ");
      }
      else if(cmd.equals("����")){
        searchView("����");
      }
      else if(cmd.equals("����")){
        searchView("����");
      }
      else {
        
      }
    }
  }
  
  
  public void openView(String option){
    JFrame f = new JFrame("�ּҷ�");
    
    JPanel panel = new JPanel();
    
    f.getContentPane().add(panel);
    
    MenuBar mb = new MenuBar();
    
    Menu sort = new Menu("����");
    MenuItem sort_name = new MenuItem("�̸���");
    MenuItem sort_age = new MenuItem("���̼�");
    MenuItem sort_sex = new MenuItem("����");
    
    Menu search = new Menu("�˻�");
    MenuItem search_name = new MenuItem("�̸����� ã��");
    MenuItem search_pNum = new MenuItem("��ȣ�� ã��");
    
    Menu modify = new Menu("����");
    MenuItem modify_insert = new MenuItem("�߰�");
    MenuItem modify_update = new MenuItem("����");
    MenuItem modify_delete = new MenuItem("����");
    
    sort_name.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {f.dispose();}
    });
    sort_name.addActionListener(new menuListener());
    
    sort_age.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {f.dispose();}
    });
    sort_age.addActionListener(new menuListener());
    
    sort_sex.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {f.dispose();}
    });
    sort_sex.addActionListener(new menuListener());
    
    
    search_name.addActionListener(new menuListener());
    search_pNum.addActionListener(new menuListener());
    
    
    modify_insert.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {f.dispose();}
    });
    modify_insert.addActionListener(new menuListener());
    
    modify_update.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {f.dispose();}
    });
    modify_update.addActionListener(new menuListener());
    
    modify_delete.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {f.dispose();}
    });
    modify_delete.addActionListener(new menuListener());
    
    sort.add(sort_name);
    sort.addSeparator();
    sort.add(sort_age);
    sort.addSeparator();
    sort.add(sort_sex);
    
    search.add(search_name);
    search.addSeparator();
    search.add(search_pNum);
    
    modify.add(modify_insert);
    modify.addSeparator();
    modify.add(modify_update);
    modify.addSeparator();
    modify.add(modify_delete);
    
    mb.add(sort);
    mb.add(search);
    mb.add(modify);
    
    PersonDAOImpl personDAOImpl = new PersonDAOImpl();
    PersonVO person = new PersonVO();
    
    int tuple = personDAOImpl.countTuples();
    Object row[][] = new Object[tuple][30];
    Object col[] = {"�̸�","����","����","����ó","�ּ�"};
    
    List tuples = personDAOImpl.findAll(option);
    Iterator itera = tuples.iterator();
    
    int index = 0;
    
    while(itera.hasNext()) {
      person=(PersonVO)itera.next();
      String n = person.getName();
      String s = person.getSex();
      int a = person.getAge();
      String p = person.getPNum();
      String ad = person.getAddress();
      
      row[index][0] = n;
      row[index][1] = s;
      row[index][2] = a;
      row[index][3] = p;
      row[index][4] = ad;
      
      index++;
    }
    
    JTable table = new JTable(row,col);
    
    panel.add(new JScrollPane(table));
    
    f.setMenuBar(mb);
    f.pack();
    f.setVisible(true);
    //personDAOImpl.close();
  }
  
  
  public void searchView(String option){
    JFrame f1 = new JFrame("ã��");
    JPanel panel1 = new JPanel();
    f1.getContentPane().add(panel1);
    
    JLabel label1 = null;
    JButton b1 = null;
    
    PersonDAOImpl personDAOImpl = new PersonDAOImpl();
    
    if(option.equals("����") || option.equals("����")){
      label1 = new JLabel("�̸�");
    }
    else{
      label1=new JLabel(option);
    }
    
    JTextField searchTF = new JTextField(20);
    
    if(option.equals("����")){
      b1 = new JButton("����");
    }
    else if(option.equals("����")){
      b1 = new JButton("����");
    }
    else{
      b1=new JButton("�˻�");
    }
    
    b1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        f1.dispose();
        if(option.equals("����")){
          insertView(1, searchTF.getText());
        }
        else if(option.equals("����")){
          personDAOImpl.delete(searchTF.getText());
          openView("id");
        }
        else{
          resultView(option, searchTF.getText());
        }
      }
    });
    
    panel1.add(label1);
    panel1.add(searchTF);
    panel1.add(b1);
    
    f1.pack();
    f1.setVisible(true);
  }
  
  public void resultView(String option, String value){
    JFrame f2 = new JFrame("�ּҷ�");
    JPanel panel2 = new JPanel();
    
    f2.getContentPane().add(panel2);
    
    List tuples = null;
    
    PersonDAOImpl personDAOImpl = new PersonDAOImpl();
    PersonVO person = new PersonVO();
    
    //int tuple = personDAOImpl.countTuples();
    Object row[][] = new Object[25][30];
    Object col[] = {"�̸�","����","����","����ó","�ּ�"};
    
    if(option.equals("�̸�")){
      tuples = personDAOImpl.findByName(value);
    }
    else if(option.equals("��ȣ")){
      tuples = personDAOImpl.findByPNum(value);
    }
    Iterator itera = tuples.iterator();
    
    int index = 0;
    
    while(itera.hasNext()) {
      person=(PersonVO)itera.next();
      String n = person.getName();
      String s = person.getSex();
      int a = person.getAge();
      String p = person.getPNum();
      String ad = person.getAddress();
      
      row[index][0] = n;
      row[index][1] = s;
      row[index][2] = a;
      row[index][3] = p;
      row[index][4] = ad;
      
      index++;
    }
    
    JTable table = new JTable(row,col);
    
    panel2.add(new JScrollPane(table));
    
    f2.pack();
    f2.setVisible(true);
  }
  
  
  public void insertView(int option, String value){
    String n = null;
    String s = null;
    int a = 0;
    String p = null;
    String ad = null;
    
    JFrame f3 = new JFrame("�Է�");
    JPanel panel3 = new JPanel(new GridLayout(6,2));
    
    f3.getContentPane().add(panel3);
    
    PersonDAOImpl personDAOImpl = new PersonDAOImpl();
    PersonVO person = new PersonVO();
    PersonVO person1 = new PersonVO();
    
    List tuples = personDAOImpl.findByName(value);
    Iterator itera = tuples.iterator();
    
    while(itera.hasNext()) {
      person=(PersonVO)itera.next();
      n = person.getName();
      s = person.getSex();
      a = person.getAge();
      p = person.getPNum();
      ad = person.getAddress();
    }
    
    JLabel label1=new JLabel("�̸�");
    JLabel label2=new JLabel("����");
    JLabel label3=new JLabel("����");
    JLabel label4=new JLabel("��ȭ��ȣ");
    JLabel label5=new JLabel("�ּ�");
    
    JTextField nameTF = new JTextField(20);
    JTextField sexTF = new JTextField(20);
    JTextField ageTF = new JTextField(20);
    JTextField numberTF = new JTextField(20);
    JTextField addressTF = new JTextField(20);
    
    if(option==1){
      nameTF.setText(n);
      sexTF.setText(s);
      ageTF.setText(a+"");
      numberTF.setText(p);
      addressTF.setText(ad);
    }
    
    JButton b1 = null;
    
    if(option==0){
      b1 = new JButton("�߰�");
    }
    else if(option == 1){
      b1 = new JButton("����");
    }
    
    b1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        person1.setName(nameTF.getText());
        person1.setSex(sexTF.getText());
        person1.setAge(Integer.parseInt(ageTF.getText()));
        person1.setPNum(numberTF.getText());
        person1.setAddress(addressTF.getText());
        
        if(option == 0){
          personDAOImpl.insert(person1);
        }
        else if(option == 1){
          personDAOImpl.update(person1);
        }
        
        f3.dispose();
        openView("id");
      }
    });
    
    panel3.add(label1);
    panel3.add(nameTF);
    
    panel3.add(label2);
    panel3.add(sexTF);
    
    panel3.add(label3);
    panel3.add(ageTF);
    
    panel3.add(label4);
    panel3.add(numberTF);
    
    panel3.add(label5);
    panel3.add(addressTF);
    
    panel3.add(b1);
    
    f3.pack();
    f3.setVisible(true);
  }
  
}