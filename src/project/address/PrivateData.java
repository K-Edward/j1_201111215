package project.address;

import java.util.*;

public class PrivateData implements Subject {
  private ArrayList observers;
  private String name;
  private String sex;
  private String age;
  private String phoneNumber;
  private String address;
  private int count;
  
  public PrivateData() {
    observers = new ArrayList();
  }
  
  public void registerObserver(Observer o){
    observers.add(o);
  }
  
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }
  
  public void notifyObservers(int cou) {
    for (int i = 0; i < observers.size(); i++) {
      Observer observer = (Observer)observers.get(i);
      observer.update(name, sex, age, phoneNumber, address, cou);
    }
  }
  
  public void setDocument(String name, String sex, String age, String pN, String address, int count) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.phoneNumber = pN;
    this.address = address;
    this.count = count;
    documentChanged(count);
  }
  
  public void documentChanged(int c){
    notifyObservers(c);
  }
  
  public String name() {
    return name;
  }
  
  public String sex(){
    return sex;
  }
  
  public String age(){
    return age;
  }
  
  public String phoneNumber() {
    return phoneNumber;
  }
  
  public String address() {
    return address;
  }
  
}