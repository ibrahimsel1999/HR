/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.hr;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
public class DBIN {
    private static String name="root";
    private static String pass="";
    private static String add="jdbc:mysql://localhost:3306/testdb";
    static String query;
    static Statement ss;
    static ResultSet r;
    public Connection conncet () throws SQLException{
        Connection c=DriverManager.getConnection(add,name ,pass);
        return c;
    }
    
    
    
}
