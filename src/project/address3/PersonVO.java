package project.address3;

public class PersonVO{
  private int id;
  private String name;
  private String sex;
  private int age;
  private String pNum;
  private String address;
  
  public void setSex(String s){
    this.sex = s;
  }
  
  public String getSex(){
    return sex;
  }
  
  public void setAge(int a){
    this.age = a;
  }
  
  public int getAge(){
    return age;
  }
  
  public void setPNum(String p){
    this.pNum = p;
  }
  
  public String getPNum(){
    return pNum;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public int getId(){
    return id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String n){
    this.name = n;
  }
  
  public String getAddress(){
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String toString(){
    return "ID : " + id + " Name : " + name + " Age : " + age + " Phone Number : " + pNum + " Address : " + address;
  }
  
}