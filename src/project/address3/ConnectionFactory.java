package project.address3;

import java.sql.*;
import java.util.Properties;
import java.io.*;

public class ConnectionFactory {
  private static Connection conn=null;
  
  private ConnectionFactory() {
    
  }
  
  public static Connection getConnection() {
    try {
      String path = System.getProperty("user.dir");
      path += "/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      
      if(conn == null){
        conn = DriverManager.getConnection(prop.getProperty("URL")+"?useSSL=true", prop.getProperty("USER"), prop.getProperty("PASSWORD"));
      }
      
      //System.out.println("����ȴ�.");
      
    } 
    catch (IOException e) {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    
    return conn;
  }
}