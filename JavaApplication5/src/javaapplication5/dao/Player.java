/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.dao;

/**
 *
 * @author Admin
 */
public class Player {
    private int ID;
    public int getID(){
        return this.ID;
    }
    
    public void setID(int _ID){
        this.ID = _ID;
    }
    
    
    private String UserName;
    public String getUserName(){
        return this.UserName;
    }
    
    public void setUserName(String _User_Name){
        this.UserName = _User_Name;
    }
    
    
    private String PassWord;
    public String getPassWord(){
        return this.PassWord;
    }
    
    public void setPassWord(String _PassWord){
        this.PassWord = _PassWord;
    }
    
   
    private String Email;
    public String getEmail(){
        return this.Email;
    }
    
    public void setEmail(String _Email){
        this.Email = _Email;
    }
    
    
    private int Friend;
    public int getFriend(){
        return this.Friend;
    }
    
    public void setFriend(int _Friend){
        this.Friend = _Friend;
    }

    public int getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int ClubName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
