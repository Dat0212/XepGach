/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.biz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaapplication5.dao.Club;
/**
 *
 * @author Admin
 */
public class ClubBiz {
    private String connStr = "jdbc:sqlserver://DESKTOP-9IJ80IO;database=Xepgach;integratedSecurity=true;";
    
    public ClubBiz(){
    }
    
    private String GetConnection(){
        return this.connStr;
    }
    
    public void Insert(Club model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String List = model.getList();
            String ClubName = model.getClubName();
            
            s.executeQuery("insert into Club values (" + ID + ",'" + List + "', '"+ ClubName + "')");
            
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Update(Club model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String List = model.getList();
            String ClubName = model.getClubName();
            
            ResultSet rs = s.executeQuery("UPDATE Club SET ID =" + ID + ", List = '" + List + "' ClubName = '" + ClubName + " Where ID = " + ID);
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Delete(Club model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String sql = "DELETE FROM Club WHERE ID = " + ID;
            
            
            ResultSet rs = s.executeQuery(sql);    
            
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
}
