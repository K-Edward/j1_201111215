package com.sd.dao.v2;

public class PersonVO {
  private int id;
  private String name;
  private String address;
  
  public void setAddress(String a){
    this.address = a;
  }
  
  public String getAddress(){
    return address;
  }
  
  public String getName(){
    return name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public int getId(){
    return id;
  }
  
  public void setId(int id){
    this.id = id;
  }
  
  public String toString(){
    return "ID: "+id+" Name: "+name+" Address: "+address;
  }
  
}