package home.example.bookshop;

import java.sql.*;

public class MyConnection {
    public Connection conn = null;
    
    public Connection getConnection()
    {
        System.out.println("<<<<<<<<<<<<<<MySQL Connection testing started!>>>>>>>>>>>>>>>>");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Where is the MySQL Driver?\nException Message: "+e.getMessage()+"\nException Stack Trace: "+e.getStackTrace().toString());
        }
        System.out.println("<<<<<<<<<<<<<<MySQL Driver Registered!>>>>>>>>>>>>>>>>");
        
        try 
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bookstore", "root", "");
        }
        
        catch (SQLException ex) 
        {
            System.out.println("Connection Failed!\nException Message: "+ex.getMessage()+"\nException Stack Trace: "+ex.getStackTrace().toString());
        }
        
        if (conn != null)
        {
            System.out.println("<<<<<<<<<<<<<<MySQL Connection Succeed!>>>>>>>>>>>>>>>>");
        }
        else
        {
            System.out.println("<<<<<<<<<<<<<<MySQL DConnection Failed!!>>>>>>>>>>>>>>>>");
        }
        return conn;
    }
}
