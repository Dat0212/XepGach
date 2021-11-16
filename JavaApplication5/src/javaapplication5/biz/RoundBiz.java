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
import javaapplication5.dao.Round;

/**
 *
 * @author Admin
 */
public class RoundBiz {
    private String connStr = "jdbc:sqlserver://DESKTOP-9IJ80IO;database=Xepgach;integratedSecurity=true;";
    
    public RoundBiz(){
    }
    
    private String GetConnection(){
        return this.connStr;
    }
    
    public void Insert(Round model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            int NumberMatchID = model.getNumberMatchID();
            String NameRound = model.getNameRound();
            int TournamentID = model.getTournamentID();
            
            s.executeQuery("insert into Round values (" + ID + "," + NumberMatchID + ", '"+ NameRound + "', " + TournamentID + ")");
            
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Update(Round model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            int NumberMatchID = model.getNumberMatchID();
            String NameRound = model.getNameRound();
            int TournamentID = model.getTournamentID();
            
            ResultSet rs = s.executeQuery("UPDATE Round SET ID =" + ID + ", NumberMatchID = " + NumberMatchID + ", NameRound = '"+ NameRound + "', TournamentID = " + TournamentID + " Where ID =" + ID);
          
        }
       catch (SQLException ex){
           System.out.println("2"); 
        
       }
        finally{
            conn.close();
        }
    }
    
    
    public void Delete(Round model) throws SQLException {
        Connection conn=DriverManager.getConnection(connStr);
        try {

            Statement s = conn.createStatement();
            int ID = model.getID();
            String sql = "DELETE FROM Round WHERE ID = " + ID;
            
            
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
