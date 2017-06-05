package com.sd.dao.v2;

import java.util.List;
import java.util.Iterator;

public class DaoMainV2{
  public static void main(String[] args){
    PersonDAOImpl personImpl = new PersonDAOImpl();
    PersonVO person = new PersonVO();
    
    person.setName("±Ë√¢»Ø");
    person.setAddress("Kyunggido Suwon");
    personImpl.insert(person);
    
    List persons = personImpl.findAll();
    Iterator iter = persons.iterator();
    
    while(iter.hasNext()){
      person = (PersonVO)iter.next();
      System.out.println(person.toString());
    }
    
    personImpl.close();
  }
}