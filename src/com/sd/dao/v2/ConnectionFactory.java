package com.sd.dao.v2;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConnectionFactory {
  private static Connection conn = null;
  
  private ConnectionFactory(){
    
  }
  
  public static Connection getConnection(){
    
//    Statement stmt = null;
//    ResultSet rs = null;
    
    try{
      String path = System.getProperty("user.dir");
      path += "/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(prop.getProperty("URL")+"?useSSL=true",prop.getProperty("USER"),prop.getProperty("PASSWORD"));
      
    }    
    catch (Exception e){
      e.printStackTrace();
    }
    
    return conn;
    
  }
}