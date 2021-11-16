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
import javaapplication5.dao.Tournament;

/**
 *
 * @author Admin
 */
public class TournamentBiz {
    private String connStr = "jdbc:sqlserver://DESKTOP-9IJ80IO;database=Xepgach;integratedSecurity=true;";
    
    public TournamentBiz(){
    }
    
    private String GetConnection(){
        return this.connStr;
    }
    
    public void Insert(Tournament model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String Name = model.getName();
            String TimeStart = model.getTimeStart();
            String EndTime = model.getEndTime();
            String Champion = model.getChampion();
            float Record = model.getRecord();
            String Prize = model.getPrize();
            
            s.executeQuery("insert into Tournament values (" + ID + ",'" + Name + "', '"+ TimeStart + "', '" + EndTime + "', '" + Champion + "', " + Record + ", '" + Prize + "')");
            
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Update(Tournament model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String Name = model.getName();
            String TimeStart = model.getTimeStart();
            String EndTime = model.getEndTime();
            String Champion = model.getChampion();
            float Record = model.getRecord();
            String Prize = model.getPrize();
            
            ResultSet rs = s.executeQuery("UPDATE Tournament SET ID =" + ID + ", Name = '" + Name + "', TimeStart = '"+ TimeStart + "', EndTime = '" + EndTime + "', 'Champion = " + Champion + "', Record = " + Record + ", 'Prize = " + Prize + " Where ID =" + ID);
          
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Delete(Tournament model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String sql = "DELETE FROM Tournament WHERE ID = " + ID;
            
            
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
