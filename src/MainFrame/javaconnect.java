package MainFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saimonazad
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;


public class javaconnect {
Connection conn=null;
public static Connection ConnecrDb()
{
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SuperShop;user=root;password=root");
        return conn;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Connection Established");
        return null; 
    }
}
    public javaconnect() {
        
    }
    
    
    
}
