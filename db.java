/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package External;

import java.sql.*;

/**
 *
 * @author catherine
 */
public class db {
      public static Connection mycon(){
        Connection con = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/finalproject1","root","");
            
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println(e);
            
        }
        
        
        
        return con;
    }

}
    
  

        
