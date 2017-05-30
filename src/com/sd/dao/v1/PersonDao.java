package com.sd.dao.v1;

import java.util.*;

public interface PersonDao {
  //CRUD
  public List<Person> getAllPersons(); //N�� ��ȸ
  public Person getPerson(int id); //�ܰ� ��ȸ, ã�� ������ id�̱� ������
  public void updatePerson(Person p);
  public void deletePerson(Person p);
}