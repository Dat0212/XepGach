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
import javaapplication5.dao.JoinedPlayer;
/**
 *
 * @author Admin
 */
public class JoinedPlayerBiz {
    private String connStr = "jdbc:sqlserver://DESKTOP-9IJ80IO;database=Xepgach;integratedSecurity=true;";
    
    public JoinedPlayerBiz(){
    }
    
    private String GetConnection(){
        return this.connStr;
    }
    
    public void Insert(JoinedPlayer model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String JoinedDate = model.getJoinedDate();
            int Player = model.getPlayer();
            int ClubID = model.getClubID();
            int PlayerID = model.getPlayerID();
            
            s.executeQuery("insert into JoinedPlayer values (" + ID + ",'" + JoinedDate + "', '"+ Player + "', '" + ClubID + "', " + PlayerID + ")");
            
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Update(JoinedPlayer model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String JoinedDate = model.getJoinedDate();
            int Player = model.getPlayer();
            int ClubID = model.getClubID();
            int PlayerID = model.getPlayerID();
            
            ResultSet rs = s.executeQuery("UPDATE JoinedPlayer SET ID =" + ID + ", JoinedDate = '" + JoinedDate + "', Player = '"+ Player + "', ClubID = '" + ClubID + "', PlayerID = " + PlayerID + " Where ID = " + ID);
          
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Delete(JoinedPlayer model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String sql = "DELETE FROM JoinedPlayer WHERE ID = " + ID;
            
            
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
