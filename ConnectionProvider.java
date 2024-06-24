/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author jitendra
 */
public class ConnectionProvider {
     private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
 private static final String URL = "jdbc:mysql://localhost:3306/ cafeteria?useSSL=false";
 private static final String USER_NAME = "root";
 private static final String PASSWORD = "root";
 
 
 public static Connection getConn(){
  try {
    Class.forName(DRIVER_CLASS);
    Connection con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
    return con;
  } catch (Exception e) {
  return null;
  }
 
 }
}
