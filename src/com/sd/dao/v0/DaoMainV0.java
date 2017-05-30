package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DaoMainV0 {
  public static void main(String[] args){
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try{
      String path = System.getProperty("user.dir");
      path += "/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(prop.getProperty("URL")+"?useSSL=true",prop.getProperty("USER"),prop.getProperty("PASSWORD"));
      
      String mySql="CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
      mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      
      stmt = conn.createStatement();
      //stmt.execute(mySql);
      
      //stmt.execute("INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')");
      //stmt.execute("insert into persons(name,address) values('v0-2','2 Hongji Dong')");
      //stmt.execute("insert into persons(name,address) values('v0-3','3 Hongji Dong')");
      
      //stmt.execute("insert into persons(name, address) values('김창환','Suwon');");
      //stmt.execute("insert into persons(name, address) values('임종현','YeonHui Dong')");
      
      //stmt.execute("delete from persons where id = 3 limit 1");
      
      rs = stmt.executeQuery("SELECT name,address FROM persons WHERE id > 4 ORDER BY id");
      
      while(rs.next()){
        System.out.println("Name : " + rs.getString("name") + ", Address : " + rs.getString("address"));
      }
    }
    
    catch (Exception e){
      e.printStackTrace();
    }
    
    finally {
      try {
        if(rs != null) rs.close();
      }
      catch (Exception e) {};
      
      try {
        if(stmt != null) stmt.close();
      }
      catch (Exception e) {};
      
      try {
        if (conn != null) conn.close();
      }
      catch (Exception e) {};
    }
    
  }
}