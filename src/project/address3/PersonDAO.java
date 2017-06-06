package project.address3;

import java.util.*;

public interface PersonDAO {
    public void insert(PersonVO person);
    public List<PersonVO> findAll(String option);
    public PersonVO findById(int id);
    public List<PersonVO> findByName(String name);
    public void update(PersonVO person);
    public void delete(String name);
    public int countTuples();
    public List<PersonVO> findByPNum(String pNum);
}