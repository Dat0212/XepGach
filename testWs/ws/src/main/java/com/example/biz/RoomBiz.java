/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.example.dao.Player;
import com.example.dao.Room;

/**
 *
 * @author Admin
 */
public class RoomBiz {
    private String connStr = "jdbc:sqlserver://DESKTOP-9IJ80IO;database=Xepgach;integratedSecurity=true;";
    
    public RoomBiz(){
    }
    
    private String GetConnection(){
        return this.connStr;
    }
    
    public void Insert(Room model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String TypeMatch = model.getTypeMatch();
            String Note = model.getTypeMatch();
            
            s.executeQuery("insert into Room values (" + ID + ",'" + TypeMatch + "', '"+ TypeMatch + "')");
            
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Update(Room model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String TypeMatch = model.getTypeMatch();
            String Note = model.getNote();
            
            ResultSet rs = s.executeQuery("UPDATE Room SET ID =" + ID + ", TypeMatch = '" + TypeMatch + "', Note = '"+ Note + " Where ID =" + ID);
          
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Delete(Room model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String sql = "DELETE FROM Room WHERE ID = " + ID;
            
            
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
