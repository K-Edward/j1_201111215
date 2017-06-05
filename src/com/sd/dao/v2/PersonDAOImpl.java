package com.sd.dao.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PersonDAOImpl implements PersonDAO {
  Connection conn = ConnectionFactory.getConnection();
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  
  public void insert(PersonVO person){
    try{
      pstmt = conn.prepareStatement("Insert into persons(id,name,address) values (NULL, ?, ?)");
      pstmt.setString(1, person.getName());
      pstmt.setString(2, person.getAddress());
      pstmt.executeUpdate();
    }
    catch(SQLException e){
      e.printStackTrace();
    }
  }
  
  public List<PersonVO> findAll(){
    Statement stmt = null;
    List<PersonVO> persons = new ArrayList<PersonVO>();
    try{
      stmt = conn.createStatement();
      rs = stmt.executeQuery("Select * from persons");
      PersonVO person = null;
      while(rs.next()){
        person = new PersonVO();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setAddress(rs.getString("address"));
        persons.add(person);
      }
      
    }
    catch(SQLException e){
      e.printStackTrace();
    }
    finally {
      try {
        if(stmt != null) stmt.close();
      } catch (Exception e) {};
    }
    return persons;
  }
  
  
  public PersonVO findById(int id){
    PersonVO person = null;
    try{
      pstmt = conn.prepareStatement("Select * from persons where id = ?");
      pstmt.setInt(1, id);
      rs = pstmt.executeQuery();
      if(rs.next()){
        person = new PersonVO();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setAddress(rs.getString("address"));
      }
      
    }
    catch(SQLException e){
      e.printStackTrace();
    }
    return person;
  }
  public void update(PersonVO person){
    try{
      pstmt = conn.prepareStatement("update persons set name = ?, addreee = ? where id = ?");
      pstmt.setString(1, person.getName());
      pstmt.setString(2, person.getAddress());
      pstmt.setInt(3, person.getId());
      pstmt.executeUpdate();
    }
    catch (SQLException e){
      e.printStackTrace();
    }
  }
  public void delete(PersonVO person){
    try{
      pstmt = conn.prepareStatement("delete from persons where name = ?");
      pstmt.setString(1, person.getName());
      int r = pstmt.executeUpdate();
      if(r == 0){
        System.out.println("can't not delete. doesn't exist.");
       }
      else if (r > 0){
        System.out.println("success.");
      }
    }
    catch (SQLException e){
      e.printStackTrace();
    }
  }
  
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