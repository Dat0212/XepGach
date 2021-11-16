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
import javaapplication5.dao.TournamentMatch;

/**
 *
 * @author Admin
 */
public class TournamentMatchBiz {
    private String connStr = "jdbc:sqlserver://DESKTOP-9IJ80IO;database=Xepgach;integratedSecurity=true;";
    
    public TournamentMatchBiz(){
    }
    
    private String GetConnection(){
        return this.connStr;
    }
    
    public void Insert(TournamentMatch model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();            
            String Player1 = model.getPlayer1();
            String Player2 = model.getPlayer2();
            String PlayerWin = model.getPlayerWin();
            int PlayerID = model.getPlayerID();
            int RoundID = model.getRoundID();
                    
            s.executeQuery("insert into TournamentMatch values ('" + Player1 + "', '" + Player2 + "', '"+ PlayerWin + "', " + PlayerID + ", " + RoundID + ")");
            
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Update(TournamentMatch model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            String Player1 = model.getPlayer1();
            String Player2 = model.getPlayer2();
            String PlayerWin = model.getPlayerWin();
            int PlayerID = model.getPlayerID();
            int RoundID = model.getRoundID();
            
            ResultSet rs = s.executeQuery("UPDATE TournamentMatch SET Player1 ='" + Player1 + "', Player2 = '" + Player2 + "', PlayerWin = '"+ PlayerWin + "', PlayerID = " + PlayerID + ", RoundID = " + RoundID + " Where Player1 =" + Player1);
          
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Delete(TournamentMatch model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            String Player1 = model.getPlayer1();
            String sql = "DELETE FROM TournamentMatch WHERE Player1 = " + Player1;
            
            
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
