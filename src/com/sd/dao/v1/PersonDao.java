package com.sd.dao.v1;

import java.util.*;

public interface PersonDao {
  //CRUD
  public List<Person> getAllPersons(); //N건 조회
  public Person getPerson(int id); //단건 조회, 찾는 조건은 id이기 때문에
  public void updatePerson(Person p);
  public void deletePerson(Person p);
}