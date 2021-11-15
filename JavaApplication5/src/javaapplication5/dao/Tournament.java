/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.dao;

/**
 *
 * @author Admin
 */
public class Tournament {
    private int ID;
    public int getID(){
        return this.ID;
    }
    
    public void setID(int _ID){
        this.ID = _ID;
    }
    
    
    private int Name;
    public int getName(){
        return this.Name;
    }
    
    public void setName(int _Name){
        this.Name = _Name;
    }
    
    
    private int TimeStart;
    public int getTimeStart(){
        return this.TimeStart;
    }
    
    public void setTimeStart(int _Time_Start){
        this.TimeStart = _Time_Start;
    }
    
    
    private int EndTime;
    public int getEndTime(){
        return this.EndTime;
    }
    
    public void setEndTime(int _End_Time){
        this.EndTime = _End_Time;
    }
    
    
    private int Champion;
    public int getChampion(){
        return this.Champion;
    }
    
    public void setChampion(int _Champion){
        this.Champion = _Champion;
    }
}
