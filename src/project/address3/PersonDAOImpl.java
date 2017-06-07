package project.address3;

import java.sql.*;
import java.util.*;
import java.io.*;

public class PersonDAOImpl implements PersonDAO {
  Connection conn = ConnectionFactory.getConnection();
  PreparedStatement pstmt=null;
  ResultSet rs=null;
  
  public void createTable(){
    Statement stmt = null;
    try{
        stmt = conn.createStatement();
        stmt.execute("Create table if not exists perData (id int(64) NOT NULL AUTO_INCREMENT, name varchar(255) NOT NULL, sex char(2), age int(5), pNumber varchar(30), address varchar(255) NOT NULL, UNIQUE(id))");
        System.out.println("테이블을 생성했습니다.");
    }
    catch(SQLException e) {
      e.printStackTrace();
    }
  }
  
  //tuple 추가하는 부분
  public void insert(PersonVO person) {
    try {
      pstmt = conn.prepareStatement("INSERT INTO perData(id,name,sex,age,pNumber,address) VALUES(NULL,?,?,?,?,?)");
      pstmt.setString(1, person.getName());
      pstmt.setString(2, person.getSex());
      pstmt.setInt(3, person.getAge());
      pstmt.setString(4, person.getPNum());
      pstmt.setString(5, person.getAddress());
      pstmt.executeUpdate();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  //id를 기준으로 검색
  public PersonVO findById(int id) {
    PersonVO person=null;
    try {
      pstmt = conn.prepareStatement("SELECT * FROM perData WHERE id=?");
      pstmt.setInt(1, id);
      System.out.println("* finding by id..."+id);
      rs = pstmt.executeQuery();
      if(rs.next()) {
        person = new PersonVO();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setSex(rs.getString("sex"));
        person.setAge(rs.getInt("age"));
        person.setPNum(rs.getString("pNumber"));
        person.setAddress(rs.getString("address"));
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return person;
  }
  
  //이름을 기준으로 검색
  public List<PersonVO> findByName(String name) {
    PersonVO person=null;
    List<PersonVO> persons = new ArrayList<PersonVO>();
    try {
      pstmt = conn.prepareStatement("SELECT * FROM perData WHERE name like ?");
      pstmt.setString(1, "%"+name+"%");
      System.out.println("* finding by name..."+name);
      rs = pstmt.executeQuery();
      while(rs.next()) {
        person = new PersonVO();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setSex(rs.getString("sex"));
        person.setAge(rs.getInt("age"));
        person.setPNum(rs.getString("pNumber"));
        person.setAddress(rs.getString("address"));
        persons.add(person);
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return persons;
  }
  
  //번호를 기준으로 검색
  public List<PersonVO> findByPNum(String pNum) {
    PersonVO person=null;
    List<PersonVO> persons = new ArrayList<PersonVO>();
    try {
      pstmt = conn.prepareStatement("SELECT * FROM perData WHERE pNumber like ?");
      pstmt.setString(1, "%"+pNum+"%");
      System.out.println("* finding by number..."+pNum);
      rs = pstmt.executeQuery();
      while(rs.next()) {
        person = new PersonVO();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setSex(rs.getString("sex"));
        person.setAge(rs.getInt("age"));
        person.setPNum(rs.getString("pNumber"));
        person.setAddress(rs.getString("address"));
        persons.add(person);
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return persons;
  }
  
  //전체 tuple 개수를 검색
  public int countTuples(){
    Statement stmt=null;
    int tuple = 0;
    try{
      stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT count(*) FROM perData");
      if(rs.next()) {
        tuple = rs.getInt(1);
      }
    }
    catch(SQLException e) {
      e.printStackTrace();
    }
    
    return tuple;
  }
  
  //전체 자료 검색
  public List<PersonVO> findAll(String option) {
    Statement stmt=null;
    List<PersonVO> persons = new ArrayList<PersonVO>();
    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT * FROM perData order by " + option);
      PersonVO person = null;
      while(rs.next()){
        person = new PersonVO();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setSex(rs.getString("sex"));
        person.setAge(rs.getInt("age"));
        person.setPNum(rs.getString("pNumber"));
        person.setAddress(rs.getString("address"));
        persons.add(person);
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    finally {
      try {
        if(stmt != null) stmt.close();
      }
      catch (Exception e) {
      
      }
    }
    return persons;
  }
  
  //id 기준 수정
  public void update(PersonVO person) {
    try {
      pstmt = conn.prepareStatement("UPDATE perData SET sex=?,age=?,pNumber=?,address=? WHERE name=?"); 
      pstmt.setString(1, person.getSex());
      pstmt.setInt(2, person.getAge());
      pstmt.setString(3, person.getPNum());
      pstmt.setString(4, person.getAddress());
      pstmt.setString(5, person.getName());
     
      System.out.println("* updating..."+person.getName());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  //tuple 삭제
  public void delete(String name) {
    try {
      pstmt = conn.prepareStatement("DELETE FROM perData WHERE name=?");
      pstmt.setString(1, name);
      int rows=pstmt.executeUpdate();
      if (rows == 0) {
        System.out.println("!can not delete..."+name+" does not exist!");
      } else if (rows > 0) {
        System.out.println("* deleting..."+name);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  //자원 닫기
  public void close() {
    System.out.println("* closing all...");
    try {
      if (rs != null) rs.close();
      if (pstmt != null) pstmt.close();
      if (conn != null) conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}