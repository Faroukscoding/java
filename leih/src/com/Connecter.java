package com;

import java.sql.*;
import javax.swing.*;

public class Connecter {
	
	Connection conn=null;
	ResultSet RS=null;
	PreparedStatement PST=null;
        
         public static Connection ConnecDB() {
        	 try {
        		 Class.forName("com.mysql.jdbc.Driver");
        		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
        		 JOptionPane.showMessageDialog(null, "connection Establise");
        		 return conn;
        	 }catch(Exception e) {
        		 JOptionPane.showMessageDialog(null, e);
        		 return null;
        	 }
         }
         public Boolean checkLogin(String txtUserid,String passwordField)
         {
             try {
                             
                PST.setString(1, txtUserid); //this replaces the 1st  "?" in the query for username
                 PST.setString(2, passwordField);    //this replaces the 2st  "?" in the query for password
                 //executes the prepared statement
                 RS=PST.executeQuery();
                 if(RS.next())
                 {
                     //TRUE iff the query founds any corresponding data
                     return true;
                 }
                 else
                 {
                     return false;
                 }
             } catch (Exception e) {
                 // TODO Auto-generated catch block
                 System.out.println("error while validating"+e);
                 return false;
             }
     }   
}   
         
         
         
         
         
         
     