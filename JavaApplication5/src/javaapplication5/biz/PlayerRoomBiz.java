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
import javaapplication5.dao.Player;

/**
 *
 * @author Admin
 */
public class PlayerRoomBiz {
    private String connStr = "jdbc:sqlserver://DESKTOP-9IJ80IO;database=Xepgach;integratedSecurity=true;";
    
    public PlayerRoomBiz(){
    }
    
    private String GetConnection(){
        return this.connStr;
    }
    
    public void Insert(Player model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String UseName = model.getUserName();
            String PassWord = model.getPassWord();
            String Email = model.getEmail();
            int Friend = model.getFriend();
            
            s.executeQuery("insert into Player values (" + ID + ",'" + UseName + "', '"+ PassWord + "', '" + Email + "', " + Friend + ")");
            
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Update(Player model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String UseName = model.getUserName();
            String PassWord = model.getPassWord();
            String Email = model.getEmail();
            int Friend = model.getFriend();
            
            ResultSet rs = s.executeQuery("UPDATE Player SET ID =" + ID + ", UseName = '" + UseName + "', PassWord = '"+ PassWord + "', Email = '" + Email + "', Friend = " + Friend + " Where ID =" + ID);
          
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Delete(Player model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String sql = "DELETE FROM Player WHERE ID = " + ID;
            
            
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
