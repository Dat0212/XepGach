/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.dao;

/**
 *
 * @author Admin
 */
public class Room {
    
    
    private int ID;
    public int getID(){
        return this.ID;
    }
    
    public void setID(int _ID){
        this.ID = _ID;
    }
    
    
    private String TypeMatch;
    public String getTypeMatch(){
        return this.TypeMatch;
    }
    
    public void setTypeMatch(String _Type_Match){
        this.TypeMatch = _Type_Match;
    }
    
    
    private String Note;
    public String getNote(){
        return this.Note;
    }
    
    public void setNote(String _Note){
        this.Note = _Note;
    }
}
