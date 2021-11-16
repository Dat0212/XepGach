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
    
    private String Name;
    public String getName(){
        return this.Name;
    }
    
    public void setName(String _Name){
        this.Name = _Name;
    }
    
    
    private String TimeStart;
    public String getTimeStart(){
        return this.TimeStart;
    }
    
    public void setTimeStart(String _Time_Start){
        this.TimeStart = _Time_Start;
    }
    
    
    private String EndTime;
    public String getEndTime(){
        return this.EndTime;
    }
    
    public void setEndTime(String _End_Time){
        this.EndTime = _End_Time;
    }
    
    
    private String Champion;
    public String getChampion(){
        return this.Champion;
    }
    
    public void setChampion(String _Champion){
        this.Champion = _Champion;
    }
    
    
    private float Record;
    public float getRecord(){
        return this.Record;
    }
    
    public void setRecord(float _Record){
        this.Record = _Record;
    }
    
    
    private String Prize;
    public String getPrize(){
        return this.Prize;
    }
    
    public void setPrize(String _Prize){
        this.Prize = _Prize;
    }
}
