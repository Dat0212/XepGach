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
import javaapplication5.dao.PlayerRoom;

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
    
    public void Insert(PlayerRoom model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            String Player1 = model.getPlayer1();
            String Player2 = model.getPlayer2();
            String TimePlay = model.getTimePlay();
            float Score = model.getScore();
            int RoomID = model.getRoomID();
            int PlayerID = model.getPlayerID();
            
            s.executeQuery("insert into PlayerRoom values (" + Player1 + ",'" + Player2 + "', '"+ TimePlay + "', '" + Score + "', " + RoomID + ", " + PlayerID + ")");
            
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Update(PlayerRoom model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            String Player1 = model.getPlayer1();
            String Player2 = model.getPlayer2();
            String TimePlay = model.getTimePlay();
            float Score = model.getScore();
            int RoomID = model.getRoomID();
            int PlayerID = model.getPlayerID();
            
            ResultSet rs = s.executeQuery("UPDATE PlayerRoom SET Player1 =" + Player1 + ", Player2 = '" + Player2 + "', TimePlay = '"+ TimePlay + "', Score = " + Score + ", RoomID = " + RoomID + " PlayerID =" + PlayerID + " Where ID =" + Player1);
          
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Delete(PlayerRoom model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            String Player1 = model.getPlayer1();
            String sql = "DELETE FROM PlayerRoom WHERE Player1 = " + Player1;
            
            
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
