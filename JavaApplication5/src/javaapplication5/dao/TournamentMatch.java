/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.dao;
/**
 *
 * @author Admin
 */
public class TournamentMatch {
    
    private String Player1;
    public String getPlayer1(){
        return this.Player1;
    }
    
    public void setPlayer1(String _Player_1){
        this.Player1 = _Player_1;
    }
    
    
    private String Player2;
    public String getPlayer2(){
        return this.Player2;
    }
    
    public void setPlayer2(String _Player_2){
        this.Player2 = _Player_2;
    }
    
    
    private String PlayerWin;
    public String getPlayerWin(){
        return this.PlayerWin;
    }
    
    public void setPlayerWin(String _Player_Win){
        this.PlayerWin = _Player_Win;
    }
    
    
    private int PlayerID;
    public int getPlayerID(){
        return this.PlayerID;
    }
    
    public void setPlayerID(int _Player_ID){
        this.PlayerID = _Player_ID;
    }
    
    
    private int RoundID;
    public int getRoundID(){
        return this.RoundID;
    }
    
    public void setRoundID(int _Round_ID){
        this.RoundID = _Round_ID;
    }
}
